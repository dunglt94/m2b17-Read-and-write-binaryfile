import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Dũng", "HN"));
        students.add(new Student(2, "Trí", "HN"));
        students.add(new Student(3, "Thắng", "HN"));
        students.add(new Student(4, "Nhật", "HN"));
        students.add(new Student(5, "Lộc", "HN"));
        students.add(new Student(6, "Hng", "HN"));

        ReadAndWrite.writeDataToFile("data/student.txt", students);
        List<Student> studentData= ReadAndWrite.readDataFromFile("data/student.txt");
        for (Student student : studentData) {
            System.out.println(student);
        }
    }
}
