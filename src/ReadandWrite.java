import java.io.*;
import java.util.ArrayList;

public class ReadandWrite { File file = new File("Student.csv");
 ManageStudent Manager = new ManageStudent();
    public void writetofile() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(Manager.students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readtofile() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            Manager.students = (ArrayList<Student>) inputStream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
