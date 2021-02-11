package decorator;

import java.util.List;

public class ExecutionTimesBaseStatistics implements StatisticsLogger{

    private final List<Double> executionTimes;

    public ExecutionTimesBaseStatistics(List<Double> executionTimes) {
        this.executionTimes = executionTimes;
    }

    @Override
    public void displayStatistics() {
        final StringBuilder stringBuilder = new StringBuilder();
        executionTimes.forEach(executionTimes->stringBuilder.append("Execution Time: ").
                append(executionTimes).append("\n"));
        System.out.println(stringBuilder.toString());
    }

    @Override
    public List<Double> getExecutionTimes() {
        return executionTimes;
    }
}
