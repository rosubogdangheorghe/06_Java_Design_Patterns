package decorator;

import java.util.List;

public class WithMeanStatisticsLogger implements  StatisticsLogger{

    private final StatisticsLogger statisticsLogger;

    public WithMeanStatisticsLogger(StatisticsLogger statisticsLogger) {
        this.statisticsLogger = statisticsLogger;
    }


    @Override
    public void displayStatistics() {
//        final Double mean = getExecutionTimes().
//                stream().mapToDouble(x->x).sum()/getExecutionTimes().size();

        double mean = getExecutionTimes().stream().
                mapToDouble(x -> x).sum();
        System.out.println("Mean is: " + mean );
        statisticsLogger.displayStatistics();
    }

    @Override
    public List<Double> getExecutionTimes() {
        return statisticsLogger.getExecutionTimes();
    }
}
