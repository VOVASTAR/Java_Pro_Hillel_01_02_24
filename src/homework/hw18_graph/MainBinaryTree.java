package homework.hw18_graph;

import java.util.concurrent.ExecutionException;

public class MainBinaryTree {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SimpleBinaryTree<Integer> simpleBinaryTree = new SimpleBinaryTree<>();

        simpleBinaryTree.add(7);
        simpleBinaryTree.add(5);
        simpleBinaryTree.add(8);
        simpleBinaryTree.add(2);
        simpleBinaryTree.add(4);
        simpleBinaryTree.add(10);

        System.out.println(simpleBinaryTree);
        NodeTree<Integer> root = simpleBinaryTree.getRoot();
        System.out.println(simpleBinaryTree.iterate(root));
    }
}
