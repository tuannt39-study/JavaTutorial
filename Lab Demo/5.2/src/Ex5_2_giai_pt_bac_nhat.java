
import java.util.Scanner;

public class Ex5_2_giai_pt_bac_nhat {
    public static void main(String[] args) {
        System.out.println("Ứng dụng giải phương trình bậc nhất: ax + b = 0");

        double nghiem;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a:");
        double a = scanner.nextDouble();
        System.out.print("Nhập b:");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0)
                System.out.println("Phương trình có vô số nghiệm");
            else
                System.out.println("Phương trình vô nghiệm");
        } else {
            nghiem = -b / a;
            System.out.println("Nghiệm của phương trình: x=" + nghiem);
        }


    }
}
