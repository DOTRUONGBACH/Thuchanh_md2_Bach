import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadandWrite {
    static File file = new File("Student.csv");
    public static void writetofile() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(ManageStudent.students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readtofile() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            ManageStudent.students = (List<Student>) inputStream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
