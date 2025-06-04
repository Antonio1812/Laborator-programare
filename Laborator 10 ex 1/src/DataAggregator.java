public class DataAggregator  {
    private StepCountStrategy strategy;
    public DataAggregator(StepCountStrategy strategy) {
        this.strategy = strategy;
    }
    public void receive(storage.DataRepository repo) {
        repo.getRecords().forEach(r -> strategy.consumeMessage(r));
    }

    public String getResults() {
        return String.format("Strategy %s: stepsCount=%d", strategy.getStrategyDescription(), strategy.getTotalSteps());
    }
}
