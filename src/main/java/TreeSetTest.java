import java.util.*;

public class TreeSetTest {

    public static void main(String arg[]) {

        TreeSet set = new TreeSet();
        int[] score = {30,40,50,11,45,33,10};
        for(int i=0; i<score.length; i++){
            set.add(score[i]);
        }
        //40보다 작은 값
        SortedSet set1 = set.headSet(40);
        System.out.println(set1.size());
        Iterator itr = set1.iterator();
        while(true) {
            int a = (int) itr.next();
            System.out.println(a);
            if(!itr.hasNext()) {
                break;
            }
        }
        //25보다 큰 값
        System.out.println(set.tailSet(25));
        //30~41숫자
        System.out.println(set.subSet(30,41));
        //35~37
        System.out.println(set.subSet(35,37));

        TreeSetNode t1 = new TreeSetNode(1,2);
        TreeSetNode t2 = new TreeSetNode(3,3);
        TreeSetNode t3 = new TreeSetNode(7,2);
        TreeSetNode t4 = new TreeSetNode(3,2);
        TreeSetNode t5 = new TreeSetNode(3,3);
        TreeSetNode t6 = new TreeSetNode(2,1);
        TreeSetNode t7 = new TreeSetNode(3,1);

        List<TreeSetNode> nodes = new ArrayList<>();
        nodes.add(t1);
        nodes.add(t2);
        nodes.add(t3);
        nodes.add(t4);
        nodes.add(t5);
        nodes.add(t6);
        nodes.add(t7);

        Collections.sort(nodes, new SortByX());

        Collections.sort(nodes, new SortByY());

        //TreeSet 사용하기... comparator class기준으로 중복되면 담기지 않음
        TreeSet<TreeSetNode> aaa = new TreeSet<>(new SortByX());
        aaa.add(t1);aaa.add(t2);aaa.add(t3);
        aaa.add(t4); //안담김. X가 중복되서
        aaa.add(t5);aaa.add(t6);aaa.add(t7);
        TreeSetNode forTest = new TreeSetNode(4,1);
        SortedSet aaatest = aaa.subSet(t4,forTest);


        TreeSet<TreeSetNode> yyy = new TreeSet<>(new SortByY());
        yyy.add(t1);yyy.add(t2);yyy.add(t3);yyy.add(t4);yyy.add(t5);yyy.add(t6);yyy.add(t7);

        TreeSet<TreeSetNode> xytest = new TreeSet<>(new SortByXY());
        xytest.add(t1);xytest.add(t2);xytest.add(t3);
        xytest.add(t4);xytest.add(t5);xytest.add(t6);
        xytest.add(t7);
    }

    static class SortByXY implements Comparator<TreeSetNode> {
        @Override
        public int compare(TreeSetNode a, TreeSetNode b) {
            if(a.x > b.x) return 1;
            if(a.x < b.x) return -1;
            if(a.x == b.x) {
                if(a.y > b.y) return 1;
                if(a.y < b.y) return -1;
                return 0;
            }
            return 0;
        }
    }

    static class TreeSetNode {
        int x; int y;
        TreeSetNode(int x, int y) {
            this.x = x; this.y = y;
        }
    }



    static class SortByX implements Comparator<TreeSetNode> {
        @Override
        public int compare(TreeSetNode a, TreeSetNode b) {
            if(a.x > b.x) return 1;
            if(a.x < b.x) return -1;
            return 0;
        }
    }

    static class SortByY implements Comparator<TreeSetNode> {

        @Override
        public int compare(TreeSetNode a, TreeSetNode b) {
            if(a.y > b.y) return 1;
            if(a.y < b.y) return -1;
            return 0;
        }

    }

}


