void main() {

    var arr  = new int[][] {{1,2} , {2,1}};

    for (var i = 0; i < arr.length; i++) {
        IO.println("Elements of the array: " + arr[i].length + ": ");
        for (var j = 0; j < arr[i].length; j++) { 
            IO.println(arr[i][j]);
        }
    }
}