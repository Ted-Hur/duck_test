package lab;


public class GcdTest {
    public static void main(String args[]) {

        long start = System.currentTimeMillis();
        System.out.println(gcd(1012123120,20123123));
        long end = System.currentTimeMillis();

        System.out.println(start + "," + end + "," + (start-end));

        for(int i=0;i<500000;i++) {
            gcd(1000, i);
        }
        long now = System.currentTimeMillis();
        System.out.println(now-end);

    }

    //recursive
    public static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b, a % b);
    }
}
