package algorithm;

public class PascalTriangle {

    static long pt[][];
    public static void main(String args[]) {

        pt = new long[10][10];
        for(int i = 0 ; i < pt.length; i++){
            for(int j = 0 ; j< i ; j++){
                pt[i][j] = 1;
                if( i > 1 && j >= 1 && j < i-1 ){
                    pt[i][j] = pt[i-1][j-1] + pt[i-1][j];
                }
                System.out.print(pt[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
