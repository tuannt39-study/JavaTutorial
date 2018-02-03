import java.util.Scanner;

public class Ex6_1_tinh_lai_vay {

    public static void main(String[] args) {
        System.out.println("Ứng dụng tính số tiền lãi ngân hàng");

        int loan_amount, loan_term;
        double interest_rate;
        double total_interest = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền vay (đơn vị đồng):");
        loan_amount = scanner.nextInt();
        System.out.print("Nhập số tháng vay:");
        loan_term = scanner.nextInt();
        System.out.println("Nhập lãi suất hằng tháng (đơn vị %):");
        interest_rate = scanner.nextDouble();

        for (int i = 1; i <= loan_term; i++) {
            total_interest += loan_amount * interest_rate / 100;
        }

        System.out.printf("%s%.4f%s\n", "Tổng số lãi phải trả khi đến hạn: ", total_interest, " đồng");
        System.out.printf("%s%.4f%s", "Tổng số tiền phải trả khi đến hạn: ", loan_amount + total_interest, " đồng");
    }
}
