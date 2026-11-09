class GameUtils {
    // Write your code here

    public static Monster[][] createPlayground(int rows, int columns) {
        return new Monster[rows][columns];
    }

    public static void displayPlayground(Monster[][] playground) {
        for (var i = 0; i < playground.length; i++) {
            String line = "";
            for (var j = 0; j < playground[i].length; j++) {
                if (playground[i][j] == null) {
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
}

