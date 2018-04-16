import org.junit.Test;

public class leet_36 {
    // boolean isValid = false;
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++ ) {
            if (!checkRow(board, i)) {
                return false;
            }
            if (!checkCol(board, i)) {
                return false;
            }
        }

        for (int i = 0; i < 3; i += 3) {
            for (int j = 0; j < 3; j += 3) {
                if (!checkCube (board, i, j)) {
                    return false;
                }
            }
        }
        return true;

    }

    private boolean checkRow (char[][] board, int initRowNum){
        // private HashMap<char, int> map = new HashMap<>();
        int[] charArr = new int[9];
        for (int i = 0; i < 9; i++) {
            char c = board[initRowNum][i];
            if (c == '.') {
                continue;
            }
            int charVal = c - '1';
            charArr[charVal]++;
        }
        for (int e : charArr) {
            if (e >= 2) {
                return  false;
            }
        }
        return true;
    }

    private boolean checkCol (char[][] board, int initColNum) {
        int[] charArr = new int[9];
        for (int i = 0; i < 9; i++) {
            char c = board[i][initColNum];
            if (c == '.') {
                continue;
            }
            int charVal = c - '1';
            charArr[charVal]++;
        }
        for (int e : charArr) {
            if (e >= 2) {
                return  false;
            }
        }
        return true;
    }

    private boolean checkCube (char[][] board, int initRowNum, int initColNum) {
        int[] charArr = new int[9];
        for (int i = initRowNum; i < initRowNum + 3; i++) {
            for (int j = initColNum; j < initColNum + 3; j++) {
                char c = board[i][j];
                if (c == '.') {
                    continue;
                }
                int charVal = c - '1';
                charArr[charVal]++;
            }
        }
        for (int e : charArr) {
            if (e >= 2) {
                return  false;
            }
        }
        return true;
    }

    @Test
    public void test01() {
//        char[][] board = [[".",".",".",".","5",".",".","1","."],[".","4",".","3",".",".",".",".","."],[".",".",".",".",".","3",".",".","1"],["8",".",".",".",".",".",".","2","."],[".",".","2",".","7",".",".",".","."],[".","1","5",".",".",".",".",".","."],[".",".",".",".",".","2",".",".","."],[".","2",".","9",".",".",".",".","."],[".",".","4",".",".",".",".",".","."]];

    }

}
