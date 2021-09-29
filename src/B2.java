import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int m = n;
        while (sc.hasNext()){
            int input = sc.nextInt();
            if (input < n) n = input;
            if (input > m) m = input;
        }
        System.out.println(n + ", " + m);
    }
}
