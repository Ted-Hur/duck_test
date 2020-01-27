package algorithm;

public class CCWTest {
    public static void main(String args[]) {
        long a = 3;
        for(int i = 0 ; i < a; i++) {
            System.out.println("33a");
        }
        System.out.println(ccw(1,1,0,0,1,0)); //1
        System.out.println(ccw(1,1,0,0,2,2)); //0
        System.out.println(ccw(1,1,0,0,2,3)); //-1

        System.out.println(ccw(1,1,1,1,3,3)); //0
        System.out.println(ccw(1,1,2,1,3,3)); //1
        System.out.println(ccw(1,1,3,1,3,3)); //1
    }

    static int ccw(int x1, int y1, int x2, int y2, int x3, int y3) {
        int temp = x1*y2+x2*y3+x3*y1;
        temp = temp - y1*x2-y2*x3-y3*x1;
        if (temp > 0) {
            return 1;
        } else if (temp < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
