public class NoOfQueens {
    public static void nQueens(char[][] board, int row){
        // base case
        
        // col
    }
    
    public static void main(String[] str){
        int n =2;
        char[][] board = new char[n][n];

        // initialize
        for ( int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        // call
        nQueens(board, 0);
    }
}


