// Write your code here
class Particle {
    private int row;
    private int column;
    private int gridRows;
    private int gridColumns;
    private int dRow;     // -1 = north, 0 = none, 1 = south
    private int dColumn;  // -1 = west, 0 = none, 1 = east

    public Particle(int row, int column, int gridRows, int gridColumns,
                    String direction) {
        this.row = row;
        this.column = column;
        this.gridRows = gridRows;
        this.gridColumns = gridColumns;

        this.dRow = 0;
        this.dColumn = 0;
        if (direction.contains("N")) {
            this.dRow = -1;
        } else if (direction.contains("S")) {
            this.dRow = 1;
        }
        if (direction.contains("E")) {
            this.dColumn = 1;
        } else if (direction.contains("W")) {
            this.dColumn = -1;
        }
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public String getDirection() {
        String result = "";
        if (this.dRow < 0) {
            result += "N";
        } else if (this.dRow > 0) {
            result += "S";
        }
        if (this.dColumn > 0) {
            result += "E";
        } else if (this.dColumn < 0) {
            result += "W";
        }
        return result;
    }

    public void move() {
        int newRow = this.row + this.dRow;
        if (newRow < 0 || newRow >= this.gridRows) {
            this.dRow = -this.dRow;
            newRow = this.row + this.dRow;
            if (newRow < 0 || newRow >= this.gridRows) {
                newRow = this.row; // grid has a single row
            }
        }

        int newColumn = this.column + this.dColumn;
        if (newColumn < 0 || newColumn >= this.gridColumns) {
            this.dColumn = -this.dColumn;
            newColumn = this.column + this.dColumn;
            if (newColumn < 0 || newColumn >= this.gridColumns) {
                newColumn = this.column; // grid has a single column
            }
        }

        this.row = newRow;
        this.column = newColumn;
    }

    public String display() {
        String nl = System.lineSeparator();
        String border = "+" + "-".repeat(this.gridColumns) + "+";

        String result = border + nl;
        for (var i = 0; i < this.gridRows; i++) {
            String line = "|";
            for (var j = 0; j < this.gridColumns; j++) {
                if (i == this.row && j == this.column) {
                    line += "*";
                } else {
                    line += " ";
                }
            }
            result += line + "|" + nl;
        }
        result += border + nl;
        result += "Position: (" + this.row + "," + this.column + "); direction: "
                + this.getDirection() + nl;
        return result;
    }
}