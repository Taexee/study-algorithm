import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];

        char[] str = sc.nextLine().toCharArray();

        for(int i = 0; i < str.length; i++){
            arr[str[i]-97]++;
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}