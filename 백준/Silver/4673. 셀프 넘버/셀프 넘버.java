public class Main {
    public static void main(String[] args) {

        // 10000이하 셀프넘버 확인을 위한 배열
        boolean [] a = new boolean[10001];

        for (int i = 1; i<10001; i++) {
            int n = d(i);

            if (n < 10001) {
                a[n] = true;
            }
        }

        // 셀프넘버인것만 출력
        for (int i = 1; i < 10001; i++) {
            if (a[i] == false) {
                System.out.println(i);
            }
        }

    }

    // d(n) 함수 정의
    public static int d(int num){
        int sum = num;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
