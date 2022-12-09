import java.util.Scanner;

public class MenuSort {
    public static void menusort() {
        Scanner scanner = new Scanner(System.in);
        ManageStudent Manager = new ManageStudent();
        while (true) {
            System.out.println("1. Sắp xếp tăng dần");
            System.out.println("2. Sắp xếp giảm dần");
            System.out.println("3. Back");
            int Choice = ErrorStudent.creatErrint(scanner);
            switch (Choice) {
                case 1 -> Manager.sortSmalltobig();
                case 2 -> Manager.sortBigtosmall();
                case 3 -> Menu.Menu();

            }
        }
    }
}