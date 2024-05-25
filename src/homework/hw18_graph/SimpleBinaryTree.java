package homework.hw18_graph;

public class SimpleBinaryTree {

    NodeTree root;

    public SimpleBinaryTree() {
        this.root = null;
    }

    public void add(Integer value) {
        recursionSearchingChild(value, root);
    }

    private NodeTree recursionSearchingChild(Integer value, NodeTree node) {

        if (node == null) {
            node = new NodeTree(value);
        }

        if (value < node.value) {
            node.leftNode = recursionSearchingChild(value, node);
        } else if (value > node.value) {
            node.rightNode = recursionSearchingChild(value, node);
        }
        return node;
    }

}
