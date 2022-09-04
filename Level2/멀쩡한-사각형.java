
public class 멀쩡한-사각형 {
    public static void main(String[] args) {
        // 예시
        int w = 8;
        int h = 12;

        /*
            문제분석
            1. 그림이 반복되는것을 확인.
            2. 예제의 8, 12 같은 모양이 4번 반복됨.
            3. 8, 12의 관계 -> 최대공약수가 4인걸 발견.
            4. 반복은 찾았으니 일반식을 분석.
            5. (2, 3) -> 2 + 3 - 1 = 4, (1,2) -> 1 + 2 - 1  = 2
                가로 + 세로 - 1 = 사라지는 사각형. == 이라는 일반식을 얻음
            6. 구현
        */

        //최대공약수 구하기
        int min = Math.min(w,h);
        int m = 0;

        for(int i = 1 ;i<=min;i++){
            if(w % i ==0 && h % i == 0){
                m = i;
            }
        }

        //최대공약수를 구했으므로 일반식 계산.
        System.out.println(
            w * h - ((w / m)+(h / m) - 1) * m
        );
    }
}
