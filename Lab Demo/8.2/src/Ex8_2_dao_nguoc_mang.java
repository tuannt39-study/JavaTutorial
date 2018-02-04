import java.util.Scanner;

public class Ex8_2_dao_nguoc_mang {

    public static void main(String[] args) {
        System.out.println("Ứng dụng đảo ngược phần tử của mảng");

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước mảng:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước mảng tối đa là 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng:");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.printf("%-20s%s", "Mảng vừa nhập: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // Đảo ngược mảng
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.println();
        System.out.printf("%-20s%s", "Mảng đảo ngược: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
