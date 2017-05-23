package UniversityDatabase;

/**
 * Created by brandon on 5/23/17.
 */
interface BinaryTreeInterface <E>{

    // Pseudocode for the basic operations of the ADT binary tree.

    void createBinaryTree(); // Creates an empty binary tree.

    void createBinaryTree(E rootItem); // Creates a one - node binary tree.

    void makeEmpty(); // Removes all of the nodes from a binary tree, leaving an empty tree.

    boolean isEmpty(); // Determines whether a binary tree is empty.

    E getRootItem() throws BinaryTreeException; //Retrieves data in binary tree root.

    // Pseudocode for the general operations of the ADT binary tree.
    void
    createBinaryTree(E rootItem, BinaryTree leftTree, BinaryTree rightTree);

    void setRootItem(E newItem); // Replaces data item in binary tree root.

    void attachLeft(E newItem) throws BinaryTreeException; //Add left child to root.

    void attachRight(E newItem) throws BinaryTreeException; //Add right child...

    void attachLeftSubtree(BinaryTree leftTree) throws BinaryTreeException; //Add left subtree.

    void attachRightSubtree(BinaryTree rightTree) throws BinaryTreeException; //Add...

    BinaryTree detachLeftSubtree() throws BinaryTreeException; //Remove and returns left subtree.

    BinaryTree detachRightSubtree() throws BinaryTreeException;//Remove and returns right...
}
