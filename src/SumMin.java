public class SumMin {
    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        int res = 0;
        for (int i = a; i <= b; i++) {
            res += a;
            System.out.println(res);
            a++;
        }
    }
}
