
public class BinaryTree {
	
	private BTNode<T> root;


	public BTNode<T> nextInorder(BTNode<T> currentNode) 
	{

		   if (currentNode.right != null) 
		   {
		      BTNode<T> pointy = currentNode.right;
		      while (!(pointy.left == null)) 
		      {
		         pointy = pointy.left;
		      }
		      return pointy;
		   }

		   BTNode<T> parenty = currentNode.parent;
		   while (parenty != null && parenty.right == currentNode) 
		   {
		      currentNode = parenty;
		      parenty = parenty.parent;
		   }
		   return parenty;
		}

}
