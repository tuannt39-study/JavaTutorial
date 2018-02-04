import java.util.Scanner;

public class Ex8_3_tim_gia_tri {
    public static void main(String[] args) {
        System.out.println("Ứng dụng tìm kiếm giá trị trong 1 mảng");

        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên cần tìm:");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí của sinh viên " + input_name + " trong danh sách là " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (isExist == false)
            System.out.println("Không tìm thấy sinh viên " + input_name + " trong danh sách");
    }
}
