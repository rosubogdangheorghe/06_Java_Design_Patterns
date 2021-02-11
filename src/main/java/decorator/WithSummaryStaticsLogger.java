package decorator;

import java.util.List;

public class WithSummaryStaticsLogger implements StatisticsLogger {
    private final StatisticsLogger statisticsLogger;

    public WithSummaryStaticsLogger(StatisticsLogger statisticsLogger) {
        this.statisticsLogger = statisticsLogger;
    }

    @Override
    public void displayStatistics() {
        System.out.println(getExecutionTimes().stream().mapToDouble(x->x).summaryStatistics());
        statisticsLogger.displayStatistics();
    }

    @Override
    public List<Double> getExecutionTimes() {
        return null;
    }
}
