package homework.hw18_graph;

public class SimpleBinaryTree<T extends Number> {

    private NodeTree<T> root;
    private double sum;

    public SimpleBinaryTree() {
        this.root = null;
    }

    public NodeTree<T> getRoot() {
        return this.root;
    }

    public void add(T value) {
        root = recursionSearchingChild(value, root);
    }

    private NodeTree<T> recursionSearchingChild(T value, NodeTree<T> node) {

        if (node == null) {
            return new NodeTree<>(value);
        }

        if (value.doubleValue() < node.getValue().doubleValue()) {
            node.setLeftNode(recursionSearchingChild(value, node.getLeftNode()));
        } else if (value.doubleValue() > node.getValue().doubleValue()) {
            node.setRightNode(recursionSearchingChild(value, node.getRightNode()));
        }
        return node;
    }

    public double iterate(NodeTree<T> root) {
        sum += root.getValue().doubleValue();
        if (root.getLeftNode() != null) {
            iterate(root.getLeftNode());
        }
        if (root.getRightNode() != null) {
            iterate(root.getRightNode());
        }
        return sum;
    }

    @Override
    public String toString() {
        return "SimpleBinaryTree{" +
                "root=" + root +
                '}';
    }
}
