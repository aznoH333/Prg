import java.util.ArrayList;
import java.util.Scanner;

public class fuj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 0;
        ArrayList<Integer> atsimacuranestezujezetyvecineukladam = new ArrayList();
        System.out.println("cause an exception to exit the pogrom...");
        try {
            while (true){
                int input = sc.nextInt();
                atsimacuranestezujezetyvecineukladam.add(input);
                b += input;
            }
        }catch (Exception e) {}
        System.out.println(b);
    }
}
