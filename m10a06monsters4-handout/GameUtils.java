class GameUtils {
    // Write your code here
    
    public static Monster[][] createPlayground(int rows, int columns) {
        return new Monster[rows][columns];
    }

    public static void displayPlayground(Monster[][] playground, int pRow, int pCol) {
        for (var i = 0; i < playground.length; i++) {
            String line = "";
            for (var j = 0; j < playground[i].length; j++) {
                if (i == pRow && j == pCol) {
                    line += "X";
                } else if (playground[i][j] == null) {
                    line += ".";
                } else {
                    line += playground[i][j].getSymbol();
                }
            }
            System.out.println(line);
        }
    }

    public static void displayMonsters(Monster[][] playground) {
        for (var i = 0; i < playground.length; i++) {
            for (var j = 0; j < playground[i].length; j++) {
                if (playground[i][j] != null) {
                    System.out.println("Row " + i + ", column " + j + ": "
                            + playground[i][j].getDescription());
                }
            }
        }
    }

    public static void hit(Monster[][] playground, int pRow, int pCol, int damage) {
        for (var i = 0; i < playground.length; i++) {
            for (var j = 0; j < playground[i].length; j++) {
                if (playground[i][j] != null
                        && Math.abs(i - pRow) <= 1
                        && Math.abs(j - pCol) <= 1) {
                    playground[i][j].hit(damage);
                }
            }
        }
    }

    public static void burn(Monster[][] playground, int pRow, int pCol, int damage) {
        for (var i = 0; i < playground.length; i++) {
            for (var j = 0; j < playground[i].length; j++) {
                if (playground[i][j] != null
                        && Math.abs(i - pRow) <= 2
                        && Math.abs(j - pCol) <= 2) {
                    playground[i][j].burn(damage);
                }
            }
        }
    }

    public static boolean playerWins(Monster[][] playground) {
        for (var i = 0; i < playground.length; i++) {
            for (var j = 0; j < playground[i].length; j++) {
                if (playground[i][j] != null && !playground[i][j].isDead()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean playerEaten(Monster[][] playground, int pRow, int pCol) {
        if (pRow < 0 || pRow >= playground.length || pCol < 0 || pCol >= playground[pRow].length) {
            return false;
        }
        return playground[pRow][pCol] != null && !playground[pRow][pCol].isDead();
    }

    public static void playGame(Monster[][] playground) {
        var scanner = new java.util.Scanner(System.in);
    
        int row = 0;
        int col = 0;


        while(true) {
            String command = scanner.nextLine();

            switch (command) {
                case "show":
                    displayPlayground(playground, row, col);
                    displayMonsters(playground);
                    break;
                case "up":
                    row = row - 1;
                    break;
                case "down":
                    row = row + 1;
                    break;
                case "left":
                    col = col - 1;
                    break;
                case "right":
                    col = col + 1;
                    break;
                case "hit":
                    hit(playground, row, col, 100);
                    break;
                case "burn":
                    burn(playground, row, col, 100);
                    break;
                default:
                    break;
            }

            if (playerEaten(playground, row, col)) {
                IO.println("You were eaten by " + playground[row][col].getDescription());
                return;
            }

            if (playerWins(playground)) {
                IO.println("You won!");
                displayMonsters(playground);
                return;
            }
        }
    }
}


