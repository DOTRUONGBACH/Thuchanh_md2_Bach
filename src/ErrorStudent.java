//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class ErrorStudent {
    public ErrorStudent() {
    }

    public static int creatErrint(Scanner scanner) {
        try {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > 0) {
                return number;
            } else {
                throw new Exception();
            }
        } catch (Exception var2) {
            System.err.println("Vui lòng nhập số > 0 ");
            return creatErrint(scanner);
        }
    }

    public static double creatErrdouble(Scanner scanner) {
        try {
            double number = Double.parseDouble(scanner.nextLine());
            if (number > 0.0) {
                return number;
            } else {
                throw new Exception();
            }
        } catch (Exception var3) {
            System.err.println("Vui lòng nhập số > 0 ");
            return creatErrdouble(scanner);
        }
    }
}
