public class Moni {
    public static void main(String[] args) {
        int input = 5442;
        int[] bankovky = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int output = 0;
        for (int bankovka :bankovky) while (bankovka <= input){
                input-=bankovka;
                output++;
            }

        System.out.println(output);
    }
}
