import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];

        for(int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
        }

        String answer = "";
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i]+1 == arr[i+1]) {
                answer = "ascending";
            } else if (arr[i+1] == arr[i]-1) {
                answer = "descending";
            } else {
                answer = "mixed";
                break;
            }
        }

        System.out.println(answer);

    }
}
