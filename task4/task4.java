import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();

        int sum2 = 0;

        Arrays.sort(arr);
        int median = arr[arr.length/2];

        for(int i = 0; i < arr.length; i++){
            sum2 += Math.abs(median - arr[i]);
        }

        System.out.println(sum2);
    }
}