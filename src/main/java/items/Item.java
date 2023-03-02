package items;

public class Item {
    public String name;
    public double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String addName(String name) {
        return this.name = this.name + "\n" + name;
    };

    public double addPrice(double price) {
        return this.price = this.price + price;
    };
}
