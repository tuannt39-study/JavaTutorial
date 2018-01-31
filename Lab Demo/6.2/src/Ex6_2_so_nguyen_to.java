
import java.util.Scanner;

public class Ex6_2_so_nguyen_to {
    public static void main(String[] args) {
        System.out.println("Ứng dụng kiểm tra số nguyên tố");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương cần kiểm tra:");
        int N = scanner.nextInt();
        if (N < 2)
            System.out.println(N + " không phải là số nguyên tố");
        else {
            int i = 2;
            boolean check = true;
            // kiểm tra từ 2 đến căn bậc 2 của N
            while (i <= Math.sqrt(N)) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(N + " là số nguyên tố");
            else
                System.out.println(N + " không phải là số nguyên tố");
        }
    }
}
