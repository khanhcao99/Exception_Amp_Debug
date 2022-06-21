package Debug;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();


        if (a != 0){
            double solution = -b / a;
            System.out.printf("Nghiệm của phương trình là: " + solution);
        }else {
            if (b == 0){
                System.out.print("Phương trình vô số nghiệm");
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }

    }

}
