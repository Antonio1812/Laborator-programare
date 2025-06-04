package dataprocessing.impl;

import storage.SensorData;
import storage.DataRepository;

import java.util.List;

public class FilteredStepCountStrategyImpl implements dataprocessing.FilteredStepCountStrategy {

    private final DataRepository dataRepository;

    public FilteredStepCountStrategyImpl(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public void consumeMessage(SensorData sample) {
        dataRepository.addSensorData(sample);
    }

    @Override
    public int getTotalSteps() {
        int totalSteps = 0;
        List<SensorData> dataList = dataRepository.getSensorData();

        for (int i = 0; i < dataList.size(); i++) {
            SensorData current = dataList.get(i);
            if (current.getStepsCount() <= 0) continue;

            int stepsLastMinute = 0;
            for (SensorData past : dataList) {
                long timeDiff = current.getTimestamp() - past.getTimestamp();
                if (timeDiff > 0 && timeDiff <= 60000) {
                    stepsLastMinute += past.getStepsCount();
                }
            }

            if (stepsLastMinute <= 1000) {
                totalSteps += current.getStepsCount();
            }
        }

        return totalSteps;
    }

    @Override
    public String getStrategyDescription() {
        return "Filtered strategy that counts only valid steps within 1-minute window and under 1000 steps.";
    }
}
