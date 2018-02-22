public class Test {
    public static void main(String[] args) {

        Student student1= new Student("Peter Jones",18); //create a student
        Student student2= new Student("Anne Kennedy",19);
        Student student3= new Student("John Doe",20);

        StudentList studentList=new StudentList(); //create a student list
        studentList.addStudent(student1); // add student to list
        studentList.addStudent(student2);
        studentList.addStudent(student3);
        studentList.display(); // display the list

        System.out.println();
        studentList.find("John Doe"); //find a student in the list
    }
}
