import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Здравствуйте!\nВведите число на скольких человек необходимо разделить счёт:");
            if(sc.hasNextInt() && sc.nextInt() > 1) System.out.println("Создаём калькулятор...");
        } while(sc.nextInt() <= 1);
    }
}
