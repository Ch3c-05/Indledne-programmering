void main(String[] args) {
    // Write your code here

    boolean isUnique = false;

    for (var i = 0; i < args.length; i++) {

        isUnique = true;

        for (var n = 0 ; n < args.length; n++) {

            if (i != n && args[i].equals(args[n])) {
                
                isUnique = false;

            }
        }

        if (isUnique) {

            System.out.println(args[i]);

        }

    }
   
}

