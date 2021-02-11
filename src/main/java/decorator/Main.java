package decorator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> executionTimes = new ArrayList<>();
        executionTimes.add(1.2);
        executionTimes.add(3.2);
        executionTimes.add(4.5);
        ExecutionTimesBaseStatistics executionTimesBaseStatistics = new ExecutionTimesBaseStatistics(executionTimes);
        executionTimesBaseStatistics.displayStatistics();
        System.out.println(executionTimesBaseStatistics.getExecutionTimes());

        StatisticsLogger statisticsLogger = new ExecutionTimesBaseStatistics(executionTimes);
        StatisticsLogger decoratedLogger = new WithSummaryStaticsLogger(statisticsLogger);

      //  System.out.println(statisticsLogger.getExecutionTimes());
       decoratedLogger.displayStatistics();

    }
}
