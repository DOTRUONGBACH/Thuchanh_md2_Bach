import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManageStudent {
    List<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void Show() {
        int j = 0;
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
            j++;
        }
        if (j ==0 ){
            System.out.println("Chưa có sinh viên nào, vui lòng thêm.");
        }
    }

    public Student inputInfor() {
        System.out.println("Nhập mã");
        int Code = ErrorStudent.creatErrint(scanner);
        System.out.println("Nhập tên");
        String Name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int Age = ErrorStudent.creatErrint(scanner);
        System.out.println("Nhập giới tính");
        String Gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String Address = scanner.nextLine();
        System.out.println("Nhập điểm trung bình");
        double GPA = ErrorStudent.creatErrdouble(scanner);
        return new Student(Code, Name, Age, Gender, Address, GPA);
    }

    public void Add() {
        students.add(inputInfor());
        System.out.println("Thêm thành công");
    }


    public int findindexBycode(Scanner scanner) {
        for (int i = 0; i < students.size(); i++) {
            if (scanner.equals(students.get(i).getStudentCode())) {
                return i;
            }
        }
        return -1;
    }

    public void Delete() {
        int index = findindexBycode(scanner);
        if (index != -1) {
            students.remove(index);
            System.out.println("Đã xóa sinh viên " + students.get(index).getStudentCode());
        } else {
            System.err.println("Không có sinh viên này");
        }
    }

    public void Edit() {
        int index = findindexBycode(scanner);
        if (students.contains(students.get(index))) {
            System.out.println("Nhập thông tin sinh viên mới");
            Student newInfor = inputInfor();
            students.set(index,newInfor);
        }
    }
    public void sortSmalltobig(){
        Collections.sort(students);
        Show();
    }
    public void sortBigtosmall(){
Collections.sort(students);
        Collections.reverse(students);
        Show();
    }
}
