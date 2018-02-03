import java.util.Scanner;

public class Ex4_2_nam_nhuan {

    public static void main(String[] args) {
        System.out.println("Ứng dụng kiểm tra năm nhuận");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm cần kiểm tra:");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println("Năm " + year + " là nhăm nhuận");
        else
            System.out.println("Năm " + year + " không phải là nhăm nhuận");
    }
}
