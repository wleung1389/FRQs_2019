import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        System.out.println("AP CALENDAR");
        System.out.println("05-01-2019 ~ " + APCalendar.dayOfWeek(05, 01, 2019));
        System.out.println("02-01-2019 ~ " + APCalendar.dayOfWeek(02, 01, 2018));
        System.out.println();

        System.out.println("StepTracker");
        StepTracker tr = new StepTracker(10000);
        System.out.println("active days " + tr.activeDays());
        System.out.println("active steps " + tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println("active days " + tr.activeDays());
        System.out.println("active steps " + tr.averageSteps());
        System.out.println();

        System.out.println("Delimiter");
        Delimeters delimeters = new Delimeters("<open>", "</close>");
        String[] input = {"<open>", "<hello>", "<test>", "</close>", "</close>", "<open>"};
        System.out.println("delimiters list");
        for (String str : delimeters.getDelimitersList(input)) {
            System.out.print(str + ", ");
        }
        System.out.println();
        System.out.println("Is Balanced? " + delimeters.isBalanced(delimeters.getDelimitersList(input)));

        System.out.println("LightBoard" + "\n" + "Original Board" + "\n");
        LightBoard board = new LightBoard(5, 5);
        for (int x = 0; x < board.lights.length; x++) {
            for (int y = 0; y < board.lights[x].length; y++) {
                if (board.lights[x][y]) {
                    System.out.print(" [X] ");
                } else {
                    System.out.print(" [ ] ");
                }
            }
            System.out.println();
        }
        System.out.println("Evaluate Light 1, 2 ~ " + board.evaluateLight(1, 2));
    }
}
