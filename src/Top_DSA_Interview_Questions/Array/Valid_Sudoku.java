package Top_DSA_Interview_Questions.Array;

public class Valid_Sudoku {
    public boolean isvalidSudoku(char[][] board){
            Set<String> seen = new HashSet<>();

            for (int i = 0; i < 9; i++){
                for (int j = 0; j < 9; j++){
                    char num = board[i][j];

                    if (num != '.'){
                        if (!seen.add(num + "at row" + i) ||
                                !seen.add(num + "at col" + j) ||
                                !seen.add(num + "at box" + i/3 + '-' + j/3))
                        {
                            return false;
                        }
                    }
                }
            }
            return true;
    }
}
