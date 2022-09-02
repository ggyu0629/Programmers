import java.util.ArrayList;

public class 기능-개발 {
    public static void main(String[] args) {

        // 예시
        int[] pro = {2,2,2};
        int[] sp = {1,1,1};

        ArrayList<Integer> arr = new ArrayList<>();

        int[] n = new int[pro.length];

        for(int i = 0 ;i<pro.length;i++){ //남은 일수를 속도로 나누어준.
                                          //나머지를 생각해서 계산후 나눠줘야함.
            n[i] = (100 - pro[i]);
            if(n[i] % sp[i] != 0){
                n[i] = n[i] / sp[i] + 1;
            }else{
                n[i] = n[i] / sp[i];
            }
        }
        int count = 1; //기능의 수 본인을 포함하기에 1로 초기화

        int point = n[0]; // 기준을 잡기위한 point

        for(int i = 1;i<pro.length;i++){
            if(point >= n[i]){
                count++;
            }else{
                arr.add(count);
                count = 1;
                point = n[i];
            }

            if(i == pro.length - 1)//마지막값
                arr.add(count);
        }
        // 확인을 위한 출력문
        System.out.println(arr);

    }
}
