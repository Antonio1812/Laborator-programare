package storage;

import java.util.ArrayList;
import java.util.List;

/**
 * Persists sensor data.
 */
public class DataRepository {

    private static DataRepository instance;

    private List<storage.SensorData> dataRecords;

    private DataRepository() {
        dataRecords = new ArrayList<>();
    }

    public static synchronized DataRepository getInstance() {
        if (instance == null) {
            instance = new DataRepository();
        }
        return instance;
    }

    public void addData(storage.SensorData dataRecord) {
        dataRecords.add(dataRecord);
    }

    public List<storage.SensorData> getRecords() {
        return new ArrayList<>(dataRecords);
    }

    public void addSensorData(storage.SensorData sample) {
    }

    public List<storage.SensorData> getSensorData() {
    }
}
