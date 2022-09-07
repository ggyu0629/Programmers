import java.util.*;

public class H-index {
    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};

        Arrays.sort(citations);
        /*
            1. 배열을 정렬한다. -> 배열을 정렬하게 되면 인용된 논문수 h가 곧 나머지 인용되지 않는 논문의 수와
                동일한 개념을 갖게 되어 굳이 계산을 두번할 필요가 없다.
            2. 진행
        */

        int h;
        int count = 0;

        for(int i = 0; i<citations.length;i++){
            h = citations.length-i;

            if(citations[i] >=h){//배열은 작은수 부터 시작하고 h는 전체 개수에서 증가되는 index만큼 빠지기 때문에
                //계산을 줄일 수 있다.
                count = h;
                break;
            }

        }

        System.out.println(count);

    }

}

