import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Чтобы рассчитать вероятное колличество маршрутов. Напишите число клиентов:");
        int clients = scanner.nextInt();
        System.out.println();
        int n =1;
        int routes = 1;
        do {
            routes*=n;
            n++;
        }
        while (n<=clients);
        System.out.println( "Колличество возможных маршрутов: - " + routes);
        }
    }
// output - Чтобы рассчитать вероятное колличество маршрутов. Напишите число клиентов:
//10
//
//Колличество возможных маршрутов: - 3628800