import java.util.Scanner;
import items.Item;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int users;
        Item items = new Item("", 0.00);

        for(;;) {
            System.out.println("Здравствуйте!" +
                    "\nВведите число на скольких человек необходимо разделить счёт:");
            users = sc.nextInt();
            if(users > 1) {
                System.out.println("Создаём калькулятор...");
                break;
            }
        }
        do {
            System.out.println("Введите имя товара:");
            items.name = items.name + " " + sc.next();
            System.out.println("Введите стоимость товара:");
            items.price = items.price + sc.nextDouble();
            System.out.println("Товар добавлен" +
                    "\n Все товары:" + items.name + " " + "на сумму" + items.price +
                    "Если хотите добавить товар, введите \"да\"" +
                    "\nЕсли нет, то введите \"завершить\"");
        } while (!sc.next().toLowerCase().equals("завершить"));
        System.out.println(items.price / users);

    }
}
