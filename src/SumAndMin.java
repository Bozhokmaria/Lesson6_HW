import java.util.Scanner;

public class SumAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число а, которое должно быть меньше числа b");
        int a = scanner.nextInt();
        System.out.println(" Введите число b, которое должно быть больше числа а");
        int b =scanner.nextInt();
        int res = 0;

        for (int i = a; i <= b; i++) {
            res+=a;
            a++;
        }
        System.out.println("Сума чисел от а до b = " + res);


        System.out.println(" Введите число с, которое должно быть меньше числа d");
        int c = scanner.nextInt();
        System.out.println(" Введите число d, которое должно быть больше числа с");
        int d =scanner.nextInt();
        System.out.println("Нечетные числа распложенные от числа с до числа d : ");
        for (int i = c; i<d-1 ; i++) {
            c++;
        if(c%2!=0){
                System.out.print(c + " ");
            }
        }
    }
}
