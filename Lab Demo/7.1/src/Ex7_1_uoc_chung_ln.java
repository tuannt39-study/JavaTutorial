
import java.util.Scanner;

public class Ex7_1_uoc_chung_ln {
    public static void main(String[] args) {
        System.out.println("Ứng dụng tìm ước chung lớn nhất");

        int a, b, UCLN;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên A:");
        a = scanner.nextInt();
        System.out.print("Nhập số nguyên B:");
        b = scanner.nextInt();

        UCLN = tim_UCLN(a, b);
        System.out.printf("Ước chung lớn nhất của " + a + " và " + b + " là: " + UCLN);
    }

    static int tim_UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            return a + b;
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
}
