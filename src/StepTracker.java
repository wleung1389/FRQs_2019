public class StepTracker {
    private int totalSteps;
    private int activeDays;
    private int totalDays;
    private int limit;

    public StepTracker(int limit) {
        this.limit = limit;
        totalDays = 0;
        totalSteps = 0;
        activeDays = 0;
    }

    public void addDailySteps(int count) {
        totalSteps += count;
        if (count >= limit) {
            activeDays++;
        }
        totalDays++;
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        return totalSteps / totalDays;
    }
}
