package lab;

import java.util.*;

public class PriorityQueueTest {

    static class Point {//implements Comparable<Point>{
        int id;
        int x, y;

        Point(int id, int x, int y){
            this.id = id;
            this.x = x;
            this.y = y;
        }

//        @Override
//        public int compareTo(Point o) {
////            if(this.id > o.id) return 1;
////            return -1;
//            if(this.x > o.x) { //x가 작은 것이 우선
//                return 1;
//            } else if(this.x == o.x) {
//                if(this.y < o.y) { //x가 같다면 y가 큰 것이 우선
//                    return 1;
//                }
//            }
//            return -1;
//        }
    }

    private static PriorityQueue<Point> getPriorityQueue() {
        Point p1 = new Point(1,3,3);
        Point p2 = new Point(5,1,1);
        Point p3 = new Point(4,1,6);
        Point p4 = new Point(2,-3,5);
        Point p5 = new Point(3,1,2);
        Point p6 = new Point(6,3,2);

        PriorityQueue<Point> pq = new PriorityQueue<>(6, (a,b)->
                a.x == b.x ? b.y - a.y : a.x - b.x); //x오름차순, 만약 x가 같으면 y내림차순
        pq.offer(p1);
        pq.offer(p2);
        pq.offer(p3);
        pq.offer(p4);
        pq.offer(p5);
        pq.offer(p6);

        return pq;
    }

    public static void main(String args[]) {

        PriorityQueue<Point> pq = getPriorityQueue();
        while (!pq.isEmpty()) {
            Point p = pq.poll();
            System.out.println(p.id + " " + p.x + " " + p.y);
        }

//        System.out.println("set long ...");
//        long long1 = 1000000;
//        System.out.println(long1);
//        long long2 = 1000000000;
//        System.out.println(long2);
//        long[][] long3 = new long[20000][20000];
//        System.out.println("test finish");
    }
}
