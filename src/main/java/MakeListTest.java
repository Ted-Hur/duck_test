import java.util.ArrayList;
import java.util.List;

public class MakeListTest {

    static int count = 0;

    static class Node
    {
        int id;
        int upperId;
        boolean visited;
        List<Node> nodeList;

        Node(int id)
        {
            this.id=id;
            this.nodeList = new ArrayList<Node>();
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUpperId() {
            return upperId;
        }

        public void setUpperId(int upperId) {
            this.upperId = upperId;
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
    public static void dfs(Node node, Node targetNode)
    {
        System.out.print(node.id + " ");
        if(node.getId() == targetNode.getUpperId()){
            List<Node> nodeList = node.getNodeList();
            if(nodeList == null){
                nodeList = new ArrayList<Node>();
            }
            nodeList.add(targetNode);
            return;
        }

        List<Node> nodeList = node.getNodeList(); //연결된 노드가 있는지
        node.visited = true;

        for (int i = 0; i < nodeList.size(); i++) {
            Node n = nodeList.get(i);
            if(n != null && !n.visited)
            {
                dfs(n, targetNode);
            }
        }
    }

    public static Node addTest(Node rootNode, Node targetNode){
        dfs(rootNode, targetNode);
        return rootNode;
    }

    public static void main(String arg[])
    {
        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node40 = new Node(40);
        Node node50 = new Node(50);
        Node node60 = new Node(60);

        node10.setUpperId(50);
        node20.setUpperId(50);
        node50.getNodeList().add(node10);
        node50.getNodeList().add(node20);

        node30.setUpperId(10);
        node40.setUpperId(20);
        node60.setUpperId(20);

        System.out.println();
        System.out.println();
        Node result = addTest(node50, node30);

        node10.setVisited(false);
        node20.setVisited(false);
        node30.setVisited(false);
        node40.setVisited(false);
        node50.setVisited(false);
        node60.setVisited(false);

        result = addTest(node50, node40);

        node10.setVisited(false);
        node20.setVisited(false);
        node30.setVisited(false);
        node40.setVisited(false);
        node50.setVisited(false);
        node60.setVisited(false);

        result = addTest(node50, node60);

        System.out.println(result.getId());

    }
}


