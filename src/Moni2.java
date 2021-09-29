public class Moni2 {
    public static void main(String[] args) {
        int input = 5443;
        int[] bankovky = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 2};
        int output = 0;
        //funi reseni
        if (input % 2 == 1) {
            input -= 5;
            output++;
        }
        for (int bankovka :bankovky)
            while (bankovka <= input){
                input-=bankovka;
                output++;
        }

        System.out.println(output);
    }
}
