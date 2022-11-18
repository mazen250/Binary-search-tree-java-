public class Main {



    public static void main(String[] args) {
        Node node = new Node(4);
        node.insert(2);
        node.insert(5);
        node.insert(1);
        node.insert(3);

        System.out.println(node.search(6));
        node.inorder();

    }
}
