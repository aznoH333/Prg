import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        int output = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 48 && input.charAt(i) <= 57)
                output += Character.getNumericValue(input.charAt(i));
        }
        System.out.println(output);
    }
}
