import java.util.Scanner;

public class Menu {
    public static void Menu() {
        System.out.println("Chương trình Quản lý sinh viên." + "\n" + "Người thực hiện: Đỗ Trường Bách");
        Scanner scanner = new Scanner(System.in);
        ManageStudent Manager = new ManageStudent();
        ReadandWrite readandWrite = new ReadandWrite();
        while (true) {
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Sửa sinh viên ");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Sắp xếp");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");
            int Choice = ErrorStudent.creatErrint(scanner);
            switch (Choice) {
                case 1 -> Manager.Show();
                case 2 -> Manager.Add();
                case 3 -> Manager.Edit();
                case 4 -> Manager.Delete();
                case 5 -> MenuSort.menusort();
                case 6 -> ReadandWrite.readtofile();
                case 7 -> ReadandWrite.writetofile();
                case 8 -> System.exit(0);
                default -> System.out.println("Vui lòng chọn đúng số");
            }
        }
    }
}

