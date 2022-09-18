import java.util.*;

public class 크레인-인형뽑기-게임 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        int cnt = 0;

        for(int i = 0;i<5;i++){
            for(int j =0;j<5;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

        for(int i = 0;i < moves.length;i++){

            for(int j = 0;j<board.length;j++){

                if(board[j][moves[i]-1]!=0){
                    if(st.empty()) {
                        st.push(board[j][moves[i]-1]);
                        System.out.println(st);
                    }
                    else{
                        if(board[j][moves[i]-1] != st.peek()){
                            st.push(board[j][moves[i]-1]);
                            System.out.println(st);
                        }else{
                            cnt++;
                            st.pop();
                            System.out.println(st);
                        }
                    }

                    board[j][moves[i]-1] = 0;
                    break;
                }
            }

        }
        System.out.println(cnt);





    }
}

