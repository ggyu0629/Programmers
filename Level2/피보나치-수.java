public class 피보나치-수 {
    public static void main(String[] args) {

        // 예시
        int n = 3;

        System.out.println(fibo(3));

    }

    public static long fibo(int num) {

        long[]arr = new long[num+1];//오버플로우를 대비해 long타입으로 선언

        int n = 1234567;

        arr[0] = 0;//1항 2항 미리선언
        arr[1] = 1;

        for (int i = 2; i <= num; i++) {//DP로 접근
            arr[i] = (arr[i - 1] % n + arr[i - 2] % n) % n;
        }

        return arr[num];
    }
}

