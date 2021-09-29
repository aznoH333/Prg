import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int output = 0;
        boolean lmao = false;
        int input = 0;

        while (true){
            input = sc.nextInt();
            if (lmao && input % 3 == 0){
                output += input;
                System.out.println(output);
            }
            lmao = !lmao;
        }
    }
}
