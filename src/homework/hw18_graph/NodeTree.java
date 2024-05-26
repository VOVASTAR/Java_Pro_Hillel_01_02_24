package homework.hw18_graph;

public class NodeTree<T extends Number> {

    private T value;
    private NodeTree<T> leftNode;
    private NodeTree<T> rightNode;

    public NodeTree(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeTree<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(NodeTree<T> leftNode) {
        this.leftNode = leftNode;
    }

    public NodeTree<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(NodeTree<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "NodeTree{" +
                "value=" + value +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }
}
