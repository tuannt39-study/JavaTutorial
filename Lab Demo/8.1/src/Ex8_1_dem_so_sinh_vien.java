import java.util.Scanner;

public class Ex8_1_dem_so_sinh_vien {
    public static void main(String[] args) {
        System.out.println("Ứng dụng đếm số sinh viên thi đõ");

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước danh sách:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Kích thước danh sách tối đa là 30");
        } while (size > 30);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập điểm của học sinh thứ " + (i + 1) + " trong danh sách:");
            array[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.print("Danh sách điểm : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\nSố lượng sinh viên thi đỗ là " + count + " sinh viên");
    }
}
