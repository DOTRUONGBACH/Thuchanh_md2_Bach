import java.util.Scanner;

public class ErrorStudent {
    public static int creatErrint(Scanner scanner) {
        try {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > 0) return number;
            throw new Exception();


        } catch (Exception exception) {
            System.err.println("Vui lòng nhập số > 0 ");
        }


        return creatErrint(scanner);
    }


    public static double creatErrdouble(Scanner scanner) {

        try {
            double number = Double.parseDouble(scanner.nextLine());
            if (number > 0) return number;
            throw new Exception();


        } catch (Exception exception) {
            System.err.println("Vui lòng nhập số > 0 ");
        }


        return creatErrdouble(scanner);
    }
}
