package jungmin;

import java.util.ArrayList;
import java.util.List;

public class DFSTest {

    static int count = 0;

    static class Node
    {
        int data;
        boolean visited;
        List<Node> nodeList;

        Node(int data)
        {
            this.data=data;
            this.nodeList = new ArrayList<Node>();

        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public boolean isVisited() {
            return visited;
        }

        public void setVisited(boolean visited) {
            this.visited = visited;
        }

        public List<Node> getNodeList() {
            return nodeList;
        }

        public void setNodeList(List<Node> nodeList) {
            this.nodeList = nodeList;
        }
    }

    // Recursive DFS
    public static void dfs(Node node)
    {
        System.out.print(node.data + " ");

        List<Node> nodeList = node.getNodeList(); //연결된 노드가 있는지
        node.visited = true;

        for (int i = 0; i < nodeList.size(); i++) { //전체 노드 갯수 저장??? 전체 노드 갯수 구하기???
            Node n = nodeList.get(i);
            if(n != null && !n.visited)
            {
                dfs(n);
            }
        }
    }

    // Recursive DFS
    public static void dfs_count(Node node)
    {
        count++;

        List<Node> nodeList = node.getNodeList();
        node.visited = true;

        for (int i = 0; i < nodeList.size(); i++) {
            System.out.println("a--a");
            Node n = nodeList.get(i);
            System.out.println(n.data);
            if(n != null && !n.visited)
            {
                dfs_count(n);
            }
        }
    }
    public static void main(String arg[])
    {
        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node40 = new Node(40);
        Node node50 = new Node(50);
        Node node60 = new Node(60);
        Node node70 = new Node(70);
        Node node80 = new Node(80);
        Node node90 = new Node(90);
        Node node100 = new Node(100);

        node50.getNodeList().add(node10);
        node50.getNodeList().add(node20);
        node10.getNodeList().add(node30);
        node10.getNodeList().add(node40);
        node20.getNodeList().add(node60);
        node20.getNodeList().add(node70);
        node20.getNodeList().add(node80);
        node80.getNodeList().add(node90);
        node90.getNodeList().add(node100);

        System.out.println();
//        dfs(node50);

        System.out.println();
        System.out.println("before count: " + count);

        //node50으로 전체 노드 갯수 구하기
        dfs_count(node50);

        System.out.println();
        System.out.println("after count : " + count);
    }
}

