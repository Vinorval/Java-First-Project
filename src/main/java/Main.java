import java.util.Scanner;
import items.Item;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int users;
        for(;;) {
            System.out.println("Здравствуйте!\nВведите число на скольких человек необходимо разделить счёт:");
            users = sc.nextInt();
            if(users > 1) {
                System.out.println("Создаём калькулятор...");
                break;
            }
        }
        System.out.println(users);

    }
}
