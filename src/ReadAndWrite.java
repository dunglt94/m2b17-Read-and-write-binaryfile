import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void writeDataToFile(String path, List<Student> students) {
        try {
            FileOutputStream fis = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fis);
            oos.writeObject(students);
            oos.close();
            fis.close();
        } catch (IOException e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //noinspection unchecked
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }
        catch (Exception e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
        return students;
    }
}
