import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class VovoceaYelenina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> zelen = new ArrayList<>();
        ArrayList<String> ovoc = new ArrayList<>();

        System.out.println("Zadej pocet zeleniny :");
        int bruh = Integer.parseInt(sc.nextLine());
        for (int n = 0; n < bruh; n++) {
            zelen.add(sc.nextLine());
        }
        System.out.println("Zadej pocet ovoce :");
        int bruh2 = Integer.parseInt(sc.nextLine());
        for (int n = 0; n < bruh2; n++) {
            ovoc.add(sc.nextLine());
        }

        while (true){
            System.out.println("Zadej vec:");
            String input = sc.nextLine();
            if (input.toLowerCase(Locale.ROOT).equals("end")) break;
            else {
                if (zelen.indexOf(input) > -1) System.out.println("Zelenyhna");
                else if (ovoc.indexOf(input) > -1) System.out.println("Orvoce");
                else System.out.println("Nen9 neexistuje");
            }
        }
    }
}
