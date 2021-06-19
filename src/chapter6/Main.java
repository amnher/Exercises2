package chapter6;

public class Main {
    public static void main(String[] args) {
        boolean[][] late = new boolean[53][7];


    }
    static void countLate(boolean[][] late) {
        int count = 0;
        for (int i = 0; i < late.length; i++) {
            for (int j = 0; j < late[0].length; j++) {
                if(late[i][j]) {
                    count++;
                }
            }
        }
    }
}
