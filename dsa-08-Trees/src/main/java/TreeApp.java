import java.util.LinkedList;
import java.util.Queue;

public class TreeApp {

    public static void main(String[] args) {

        MyTree tree=new MyTree();
        int[] numbers=new int[] {10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};

        for (int i = 0; i <11; i++) {
            tree.insert(numbers[i]);
        }
        VisualizeTree.printTree(tree.root,null,false);

        System.out.println("Pre-Order Traversal of the Tree");
        tree.preOrderTraversal(tree.root);
        System.out.println();
        System.out.println("In-Order Traversal of the Tree");
        tree.inOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Post-Order Traversal of the Tree");
        tree.postOrderTraversal(tree.root);

        System.out.println();
        System.out.println("Level-Order Traversal of the Tree");
        tree.levelOrderTraversal(tree.root);


    }


    }


