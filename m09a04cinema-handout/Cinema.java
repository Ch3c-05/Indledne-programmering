// Write your code here
class Cinema {
    private boolean[][] seats;

    public Cinema(int[] seatsOnRows) {
        this.seats = new boolean[seatsOnRows.length][];

        for (var i = 0; i < seatsOnRows.length; i++) {
            this.seats[i] = new boolean[seatsOnRows[i]];
        }
    }

    public int rows() {
        return this.seats.length;
    }
   public int seatsOnRow(int row) {
        if (!isValidRow(row)) {
            return 0;
        }
        return this.seats[row].length;
    }

    public int seats() {
        int total = 0;
        for (var i = 0; i < this.seats.length; i++) {
            total += this.seats[i].length;
        }
        return total;
    }

    public int rowVacancies(int row) {
        if (!isValidRow(row)) {
            return 0;
        }

        int vacant = 0;
        for (var j = 0; j < this.seats[row].length; j++) {
            if (!this.seats[row][j]) {
                vacant++;
            }
        }
        return vacant;
    }

    public int vacancies() {
        int total = 0;
        for (var i = 0; i < this.seats.length; i++) {
            total += rowVacancies(i);
        }
        return total;
    }

    public void book(int row, int column) {
        if (!isValidSeat(row, column)) {
            return;
        }
        this.seats[row][column] = true;
    }

    public void release(int row, int column) {
        if (!isValidSeat(row, column)) {
            return;
        }
        this.seats[row][column] = false;
    }

    public String seatMap() {
        String map = "";

        for (var i = 0; i < this.seats.length; i++) {
            for (var j = 0; j < this.seats[i].length; j++) {
                if (this.seats[i][j]) {
                    map += ('X');
                } else {
                    map += ('.');
                }
            }
            map += System.lineSeparator();
        }
        return map;
    }

    private boolean isValidRow(int row) {
        return row >= 0 && row < this.seats.length;
    }

    private boolean isValidSeat(int row, int column) {
        return isValidRow(row) && column >= 0 && column < this.seats[row].length;
    }
}
