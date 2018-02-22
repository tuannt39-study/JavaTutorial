public class TestCourse {

    public static void main(String[] args) {
        Course course1 = new Course("Data Structures"); //create a course
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones"); //add a student
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        course1.addStudent("John Doe");
        course1.dropStudent("John Doe"); // drop a student

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents()); //number of students
        String[] students = course1.getStudents(); // return students
        for (int i = 0; i < course1.getNumberOfStudents(); i++) System.out.print(students[i] + ", ");
        System.out.println();

        System.out.print("Number of students in course2: " + course2.getNumberOfStudents());
    }
}