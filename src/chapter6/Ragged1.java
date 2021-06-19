package chapter6;

public class Ragged1 {
    public static void main(String[] args) {
        int[][] triangle =
                {{11},
                {2,3},
                {4,5,6},
                {7,8,9,10}
                };
        max(triangle);
    }
    static void max(int[][] arrayIn) {
        int result = arrayIn[0][0];
        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn[i].length; j++) {
                if (result < arrayIn[i][j]) {
                    result = arrayIn[i][j];
                }
            }
        }
        System.out.println(result);
    }
}
