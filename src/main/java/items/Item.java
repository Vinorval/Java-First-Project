package items;

public class Item {
    public String name;
    public double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String addName(String name) {
        System.out.println("Введите имя товара:");
        return this.name = this.name + " " + name;
    };

    public double addPrice(double price) {
        System.out.println("Введите стоимость товара:");
        return this.price = this.price + price;
    };
}
