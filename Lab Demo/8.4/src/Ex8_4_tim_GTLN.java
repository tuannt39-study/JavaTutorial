import java.util.Scanner;

public class Ex8_4_tim_GTLN {
    public static void main(String[] args) {
        System.out.println("Ứng dụng đảo ngược phần tử của mảng");

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước danh sách:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước danh sách tối đa là 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập tài sản thứ " + (i + 1) + " của danh sách:");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Danh sách tài sản: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị tài sản lớn nhất trong danh sách là " + max + " ,vị trí số " + index);
    }
}
