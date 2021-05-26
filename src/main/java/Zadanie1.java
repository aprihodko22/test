import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        String d = scanner.nextLine();
//        String p = "Вячеслав";
//        if (d.equals(p)) {
//            System.out.println("Привет, Вячеслав");
//        }else {
//            System.out.println("Нет такого имени");
//        }

        int[] i = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int g = 0; g<i.length; g++){
            if (i[g] %3==0){
                System.out.println(i[g]);
            }
        }

//        if (i > 7) {
//            System.out.println("Привет");
//        }
    }
}
