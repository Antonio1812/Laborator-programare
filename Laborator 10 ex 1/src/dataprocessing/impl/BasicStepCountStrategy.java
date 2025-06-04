package dataprocessing.impl;

import storage.SensorData;
import storage.DataRepository;

public class BasicStepCountStrategyImpl implements dataprocessing.BasicStepCountStrategy {

    private final DataRepository dataRepository;

    public BasicStepCountStrategyImpl(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public void consumeMessage(SensorData sample) {
        dataRepository.addSensorData(sample); // presupunem că există această metodă
    }

    @Override
    public int getTotalSteps() {
        int totalSteps = 0;
        for (SensorData data : dataRepository.getSensorData()) {
            totalSteps += data.getStepsCount();
        }
        return totalSteps;
    }

    @Override
    public String getStrategyDescription() {
        return "Basic strategy that sums all received steps.";
    }
}
