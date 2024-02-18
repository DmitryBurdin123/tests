import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        double xCenter;
        double yCenter;
        double radius;
        double xPoint;
        double yPoint;

        try {

            File file1 = new File("C:\\Program Files\\JetBrains\\file1.txt");
            Scanner scanner1 = new Scanner(file1);
            xCenter = scanner1.nextDouble();
            yCenter = scanner1.nextDouble();
            radius = scanner1.nextDouble();
            scanner1.close();


            File file2 = new File("C:\\Program Files\\JetBrains\\file2.txt");
            Scanner scanner2 = new Scanner(file2);
            xPoint = scanner2.nextDouble();
            yPoint = scanner2.nextDouble();
            scanner2.close();


            double distance = Math.sqrt(Math.pow((xCenter - xPoint), 2) + Math.pow((yCenter - yPoint), 2));


            if (distance < radius) {
                System.out.println(1);
            } else if (distance == radius) {
                System.out.println(0);
            } else {
                System.out.println(2);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
    }
}