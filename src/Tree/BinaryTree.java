package Tree;

/**
 * Created by brandon on 5/23/17.
 */
class BinaryTree extends BinaryTreeBasis {

    public void createBinaryTree() {

    }

    public void createBinaryTree(Object rootItem) {

    }

    public void createBinaryTree(Object rootItem, BinaryTree leftTree, BinaryTree rightTree) {

    }

    public void makeEmpty() {

    }

    public boolean isEmpty() {
        return false;
    }

    public Object getRootItem() throws BinaryTreeException {
        return null;
    }

    public void setRootItem(Object newItem) {

    }

    public void attachLeft(Object newItem) throws BinaryTreeException {

    }

    public void attachRight(Object newItem) throws BinaryTreeException {

    }

    public BinaryTree detachLeftSubtree() throws BinaryTreeException {
        return null;
    }

    public BinaryTree detachRightSubtree() throws BinaryTreeException {
        return null;
    }

    public void attachRightSubtree(BinaryTree rightTree) throws BinaryTreeException {

    }

    public void attachLeftSubtree(BinaryTree leftTree) throws BinaryTreeException {

    }

    void remove(){

    }

    Object getLeftSubtree (){

    }

    Object getRightSubtree(){
        return this.
    }

    // Pseudocode for the traversal of the ADT binary tree.
    void traverse( BinaryTree binTree ) {

        if ( !binTree.isEmpty() ) {
            Object root = binTree.getRootItem(); // Visit root node here (preorder traversal).
            traverse(  root.getLeftSubtree() ); // Visit root node here (inorder traversal).
            traverse( root.getRightSubtree() ); // Visit root node here (postorder traversal).
        }
    }
}