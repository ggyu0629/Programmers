import java.util.Stack;

public class 짝지어-제거하기 {
    public static void main(String[] args) {
        String s = "baabaa";

        Stack<String> st = new Stack<>();// 스택선언

        for(String q : s.split("")){// 문자열을 잘라 반복
            if(!st.isEmpty() && st.peek().equals(q))// 스택에 값이 존재하고, 그 값과 다음 문자의 값이 동일할 경우
                                                    // 스택에서 값을 제거함.
                st.pop();
            else                                    // 아닐경우 스택에 추가.
                st.push((q));
        }
        // 마지막에 스택에 값이 남아있다면 정리가 되지 않은것이다.
        // 그러므로 삼항연산자를 통해 출력형태에 맞게 반환.
        // 프로그래머스같은 경우 answer 안에 값을 넣어주어야 하므로
        // int answer = st.isEmpty() ? 1 : 0; 을 추가해준다.

        System.out.println(st.isEmpty()?1:0);//확인을 위한 코드.
    }
}
