import java.util.NoSuchElementException;

public class BTNode {
	
	T data;
	   BTNode<T> left, right, parent;

	   BTNode(T data, BTNode<T> left, BTNode<T> right) {
	      this.data = data;
	      this.left = left;
	      this.right = right;
	   }
	   
	  
	   
	   public static <T> boolean isomorphic(BTNode<T> T1, BTNode<T> T2) 
		{
			   if (T1 != null && T2 != null) 
			   {
				   if (T1 == null || T2 == null || !isomorphic(T1.left, T2.left)) 
				   {
				      return false;
				   }
			   }
			   else
			   {
				   return true;
			   }
			   
			   return isomorphic(T1.right, T2.right);
			}
	   
	  
	   
	   
	   public static <T> BTNode<T> genTreeParent(BTNode<T> x) 
	   {
		   while (x.parent != null) {
		      
			   if (!(x != x.parent.left)) 
			  {
		         return x.parent;
		      }
			   
		      x = x.parent;
		   }
		   
		   return null;
		}
	   
	 
	   
	   
	   public static <T> BTNode<T> genTreekthChild(BTNode<T> x, int k) throws NoSuchElementException 
	   {
		   if (k <= 0 || x.left == null) 
		   {
		      
			   throw new NoSuchElementException();
			   
		   }
		   
		   k-=1;
		   x = x.left;
		   
		  
		   while (k > 0 && x.right != null) 
		   {
		      x = x.right;
		      k-=1;
		   }
		  
		   if ((!(k < 0))) 
		   { 
		      throw new NoSuchElementException();
		   }
		   return x;
		}

}
