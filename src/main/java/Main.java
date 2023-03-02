import java.util.Scanner;
import items.Item;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int users;
        Item items = new Item("", 0.00);
        String[] strings = {
                "Здравствуйте!\nВведите число на скольких человек необходимо разделить счёт:",
                "Введите имя товара:",
                "Введите стоимость товара:",
                "Товар добавлен. Если хотите добавить товар, введите \"да\"\nЕсли нет, то введите \"завершить\"",
                "Добавленные товары: %s\n каждый должен заплатить: %.2f"
        };

        for(;;) {
            System.out.println(strings[0]);
            users = sc.nextInt();
            if(users > 1) break;
        }
        do {
            System.out.println(strings[1]);
            items.addName(sc.next());

            System.out.println(strings[2]);
            items.addPrice(sc.nextDouble());

            System.out.println(strings[3]);
        } while (!sc.next().toLowerCase().equals("завершить"));

        System.out.println(String.format(strings[4], items.name, items.price / users));

    }
}
