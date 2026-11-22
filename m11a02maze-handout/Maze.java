class Maze {
    // Write your code here
    public static char[][] createMaze(int rows, int columns) {
        char[][] maze = new char[rows][columns];
        for (var i = 0; i < maze.length; i++) {
            for (var j = 0; j < maze[i].length; j++) {
                maze[i][j] = ' ';
            }
        }
        return maze;
    }

    public static boolean moveUp(char[][] maze) {
        for (var i = 0; i < maze.length; i++) {
            for (var j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 'X') {
                    if ((i - 1) < 0) {
                        return false;
                    } else if (maze[i - 1][j] != ' ') {
                        return false;
                    } else {
                        maze[i][j] = ' ';
                        maze[i - 1][j] = 'X';
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean moveDown(char[][] maze) {
        for (var i = 0; i < maze.length; i++) {
            for (var j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 'X') {
                    if ((i + 1) >= maze.length) {
                        return false;
                    } else if (maze[i + 1][j] != ' ') {
                        return false;
                    } else {
                        maze[i][j] = ' ';
                        maze[i + 1][j] = 'X';
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean moveLeft(char[][] maze) {
        for (var i = 0; i < maze.length; i++) {
            for (var j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 'X') {
                    if ((j - 1) < 0) {
                        return false;
                    } else if (maze[i][j - 1] != ' ') {
                        return false;
                    } else {
                        maze[i][j] = ' ';
                        maze[i][j - 1] = 'X';
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean moveRight(char[][] maze) {
        for (var i = 0; i < maze.length; i++) {
            for (var j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 'X') {
                    if (j + 1 >= maze[i].length) {
                        return false;
                    } else if (maze[i][j + 1] != ' ') {
                        return false;
                    } else {
                        maze[i][j] = ' ';
                        maze[i][j + 1] = 'X';
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
