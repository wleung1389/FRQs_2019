public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];
        for (int x = 0; x < numRows; x++) {
            for (int y = 0; y < numCols; y++) {
                int chance = (int) (Math.random() * 100);
                if (chance < 40) {
                    lights[x][y] = true;
                } else {
                    lights[x][y] = false;
                }
            }
        }
    }

    public boolean evaluateLight(int row, int col) {
        int numOn = 0;
        for (int x = 0; x < lights.length; x++) {
            if (lights[x][col]) {
                numOn++;
            }
        }
        if (lights[row][col]) {
            if (numOn % 2 == 0) {
                return false;
            }
        } else if (!lights[row][col]) {
            if (numOn % 3 == 0) {
                return true;
            }
        }
        return lights[row][col];
    }
}
