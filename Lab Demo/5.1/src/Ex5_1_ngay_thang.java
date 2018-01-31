
import java.util.Scanner;

public class Ex5_1_ngay_thang {
    public static void main(String[] args) {

        System.out.println("Ứng dụng tính số ngày của tháng");

        System.out.print("Nhập tháng:");
        Scanner scanner = new Scanner(System.in);
        int thang = scanner.nextInt();

        switch (thang) {
            case 1:
                System.out.println("Tháng " + thang + " có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng " + thang + " có 28 hoặc 29 ngày");
                break;
            case 3:
                System.out.println("Tháng " + thang + " có 31 ngày");
                break;
            case 4:
                System.out.println("Tháng " + thang + " có 30 ngày");
                break;
            case 5:
                System.out.println("Tháng " + thang + " có 31 ngày");
                break;
            case 6:
                System.out.println("Tháng " + thang + " có 30 ngày");
                break;
            case 7:
                System.out.println("Tháng " + thang + " có 31 ngày");
                break;
            case 8:
                System.out.println("Tháng " + thang + " có 31 ngày");
                break;
            case 9:
                System.out.println("Tháng " + thang + " có 30 ngày");
                break;
            case 10:
                System.out.println("Tháng " + thang + " có 31 ngày");
                break;
            case 11:
                System.out.println("Tháng " + thang + " có 30 ngày");
                break;
            case 12:
                System.out.println("Tháng " + thang + " có 31 ngày");
                break;
            default:
                System.out.println("Tháng nhâp vào không đúng");
        }

    }

}

