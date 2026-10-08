void main () {

    var item1 = new ShopItem("Freesbee", 120, 42);


    ShopItem item2 = new ShopItem("Cookies", 65.5, 13);


    System.out.println(item1.description());
    System.out.println(item2.description());

    item1.increasePrice(100.0);
    item2.increasePrice(15.0);

    System.out.println(item1.description());
    System.out.println(item2.description());
}


class ShopItem {
    String name;
    double price;
    int availability;

    ShopItem(String name, double initialPrice, int initialAvail) {
        this.name = name;
        this.price = initialPrice;
        this.availability = initialAvail;
    }

    String description() {
        return "Item name: " + this.name + ", price = " + this.price + ", availibility: " + this.availability;

    }

    void increasePrice(double amount) {
        this.price = this.price + amount;
    }
}



