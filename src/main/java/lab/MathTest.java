package lab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class MathTest {
    public static void main(String args[]) {
        System.out.println(Math.max(1,2));
        System.out.println(Math.abs(4));
        System.out.println(Math.abs(-3));
        System.out.println(Math.acos(3));
        System.out.println(Math.ceil(3));

        BigInteger b1 = new BigInteger("2");
        BigInteger b2 = new BigInteger("2");
        for(int i=1; i<38; i++) {
            b2 = b2.multiply(b1);
        }
        System.out.println(b2);

        //122~160까지임... ==> 38칸감...
        BigDecimal d1 = new BigDecimal("34359738368"); //답변의 답...
        BigDecimal d2 = new BigDecimal("274877906944");
        System.out.println(d2.divide(d1));

        //1칸.. 123 -> d2 + 38
        //38번째칸.. 1
        //37번째칸 .. 1+38
        //가운데 34칸있음. 37-2-1
        //
        BigDecimal s1 = new BigDecimal("274877906944"); //답변의 답... 하나뺀놈...
        BigDecimal s2 = new BigDecimal("38").add(s1);
        BigDecimal s37 = new BigDecimal("39");
        BigDecimal s38 = new BigDecimal("1");
        BigDecimal div1 = new BigDecimal("34");

        System.out.println((s2.subtract(s37)));//.divide(div1);

//        BigDecimal t1 = new BigDecimal("274877906943");
//        System.out.println(t1.divide(div1, MathContext.DECIMAL32));
        System.out.println((s2.subtract(s37)).divide(div1, RoundingMode.HALF_EVEN));

        BigDecimal r1 = new BigDecimal("8084644322");
        System.out.println(r1.divide(new BigDecimal("8"), RoundingMode.HALF_UP));

//        BigDecimal d3 = new BigDecimal("1461501637330902918203684832716283019655932542976");
//1 1 9 25 49 81 121
    }
}
