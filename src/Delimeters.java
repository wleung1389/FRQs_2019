import java.util.ArrayList;

public class Delimeters {
    private String openDel;
    private String closeDel;

    public Delimeters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> list = new ArrayList<>();
        for (String str : tokens) {
            if (str.equals(openDel) || str.equals(closeDel)) {
                list.add(str);
            }
        }
        return list;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int open = 0;
        int close = 0;
        for (String str : delimiters) {
            if (close > open) {
                return false;
            }
            if (str.equals(openDel)) {
                open++;
            } else if (str.equals(closeDel)) {
                close++;
            }
        }
        return open == close;
    }
}
