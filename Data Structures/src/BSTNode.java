import java.util.ArrayList;

public class BSTNode {

	   T data;
	   BSTNode<T> left;
	   BSTNODE<T> right;

	   public BSTNode(T data) {
	      this.data = data;
	      this.left = null;
	      this.right = null;
	   }

	   public String toString() {
	      return data.toString();
	   }
	   
	   BSTNode<T> root;
	   int size;


	   public void insert(T target) throws IllegalArgumentException 
	   {
	      root = insert(target, root);
	      size+=1;
	   }

	   
	   
	   
	   
	   private BSTNode<T> insert(T target, BSTNode<T> root) throws IllegalArgumentException 
	   {
	      if (!(root != null)) 
	      {
	         return new BSTNode<>(target);
	      }

	      int checker = target.compareTo(root.data);
	     
	      if (checker == 0) 
	      {
	         throw new IllegalArgumentException("Duplicate key");
	      }
	     
	      if (checker > 0) 
	      {
	    	  root.right = insert(target, root.right);
	         
	      }
	     
	      else 
	      {
	    	  root.left = insert(target, root.left);
	      }
	      return root;
	   }

	   
	   
	   
	   
	   public static <T extends Comparable<T>> void keysInRange
	   							(BSTNode<T> root, T min, T max, ArrayList<T> result) {
	
		   int checkuno = min.compareTo(root.data);
		   int checkdos = root.data.compareTo(max);
		  
		   if (checkuno <= 0 && checkdos <= 0) 
		   {  
		      result.add(root.data);
		   }
		  
		   if (checkuno < 0) 
		   {
		      keysInRange(root.left, min, max, result);
		   }
		   
		   if (checkdos < 0) 
		   {
		      keysInRange(root.right, min, max, result);
		   }
		}

	   
	   
	   
	   
	   public static <T extends Comparable<T>> void reverseKeys(BSTNode<T> root) 
	   {
	
		   reverseKeys(root.right);
		   
		   reverseKeys(root.left);
		   
		   BSTNode<T> ptr = root.left;
		   
		   root.left = root.right;
		   
		   root.right = ptr;
		}
	   

	   
	   
	   
	   
	   int rightSize;  
   
	   public static <T extends Comparable<T>> T kthLargest(BSTNode<T> root, int k) 
	   {
		   
		   if (root.rightSize >= k) 
		   {
		      return kthLargest(root.right, k);
		   }
		   
		   if (root.rightSize == (k - 1)) 
		   {
		      return root.data;
		   } 
		   
		   return kthLargest(root.left, k - root.rightSize - 1);
		}
}
