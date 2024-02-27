import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Требуется ввести 2 аргумента");
            return;
        }

        String circleFilename = args[0];
        String pointsFilename = args[1];

        try {
            File circleFile = new File(circleFilename);
            Scanner circleScanner = new Scanner(circleFile);
            double xCenter = circleScanner.nextDouble();
            double yCenter = circleScanner.nextDouble();
            double radius = circleScanner.nextDouble();
            circleScanner.close();

            File pointsFile = new File(pointsFilename);
            Scanner pointsScanner = new Scanner(pointsFile);
            while (pointsScanner.hasNextDouble()) {
                double xPoint = pointsScanner.nextDouble();
                double yPoint = pointsScanner.nextDouble();
                double distance = Math.sqrt(Math.pow((xCenter - xPoint), 2) + Math.pow((yCenter - yPoint), 2));
                if (distance < radius) {
                    System.out.println(1);
                } else if (distance == radius) {
                    System.out.println(0);
                } else {
                    System.out.println(2);
                }
            }
            pointsScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
    }
}
