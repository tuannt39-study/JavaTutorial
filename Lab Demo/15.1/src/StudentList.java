
public class StudentList {
    private Student[] students = new Student[20];
    private int size;

    public StudentList() {
    }

    public void display() {
        System.out.print("Student list: ");
        for (int i = 0; i < size; i++) {
            System.out.print(students[i].showInfo() + ",");
        }
    }

    public void addStudent(Student student) {
        students[size] = student;
        size++;
    }

    public void find(String studentName) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (students[i].getName().equals(studentName)) {
                System.out.println("The position of student " + studentName + " in the list is " + (i + 1));
                count++;
                break;
            }
        }
        if (count < 1)
            System.out.println("There is no student name " + studentName + " in the list");
    }
}