import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {


        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        if (n >=1 && m>=1){
            if(n>1 && m==1){
                int a = 1;
                while(a<=n){
                    System.out.print(a);
                    a++;
                }return;
            }

            int[] arr = new int[n];
            Arrays.setAll(arr, i -> ++i);

            int current = 0;
            do {
                System.out.print(arr[current]);
                current = (current + m - 1) % n;
            } while (current != 0);
        }else{
            System.out.println("Введите значения n>=1 и m>=1");
        }
    }
}
