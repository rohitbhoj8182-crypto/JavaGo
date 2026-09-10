import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value :");
            arr[i] = sc.nextInt();
        }

        for (int el : arr) {
            if(el %2 == 0){
                System.out.println(el);
            }
        }

        sc.close();
    }
}