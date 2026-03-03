public class TreeTester
{
  public static void main( String[] args )
  {
    double trunkR = 1.0, trunkH = 1.0, branchR = 11.0, branchH = 10.0 ;
    
    Tree myTree = new Tree( trunkR, trunkH, branchR, branchH, 1, 2, 3  );
    System.out.println("myTree: " + myTree + "\n");
    
    myTree.grow( 0.10 );
    System.out.println("bigger Tree: " + myTree);
  }
}
