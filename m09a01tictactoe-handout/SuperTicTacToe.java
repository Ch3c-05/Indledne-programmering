// Write your code here
class SuperTicTacToe {
    public static String[][] createGrid(int n) {
        return new String[n][n];
    }

    public static boolean hasWinner(String[][] grid) {
       for (var i = 0; i < grid.length; i++) {
            if (grid[i][0] == null) {
                continue;
            }
        
            boolean rowWins = true;

            for(var j = 0; j < grid[i].length; j++) {
                if (!grid[i][0].equals(grid[i][j])) {
                    rowWins = false;
                }
            }
            
            if (rowWins == true) {
                return true;
            } 
        }

       for (var j = 0; j < grid[0].length; j++) {
            if (grid[0][j] == null) {
                continue;
            }
        
            boolean colWins = true;

            for(var i = 0; i < grid.length; i++) {
                if (!grid[0][j].equals(grid[i][j])) {
                    colWins = false;
                }
            }
            
            if (colWins == true) {
                return true;
            } 
        }
        return false;
    }
}