package lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTest {

    static class Point implements Comparable<Point>{
        int id;
        int x, y;

        Point(int id, int x, int y){
            this.id = id;
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if(this.x > o.x) { //x가 작은 것이 우선
                return 1;
            } else if(this.x == o.x) {
                if(this.y < o.y) { //x가 같다면 y가 큰 것이 우선
                    return 1;
                }
            }
            return -1;
        }
    }

    public static void main(String args[]) {
        Point p1 = new Point(1,3,3);
        Point p2 = new Point(2,3,5);
        Point p3 = new Point(3,1,2);
        Point p4 = new Point(4,1,6);
        Point p5 = new Point(5,1,1);
        Point p6 = new Point(6,3,2);

        List<Point> points = new ArrayList<>();
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);
        points.add(p5);
        points.add(p6);

        System.out.println("before sort....");
        for(int i=0; i<6; i++){
            System.out.println(points.get(i).id);
        }

        Collections.sort(points);
        System.out.println("after sort....");
        for(int i=0; i<6; i++){
            System.out.println(points.get(i).id);
        }
    }
}
