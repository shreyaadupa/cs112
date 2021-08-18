
public class LinkedList {

	private Node<T> front;
	   int size;
	  
	   public boolean moveTowardFront(T target) {
		   Node pointy = front;
		   Node before = null;
		  
		   while (pointy != null) {
		      if (pointy.data.equals(target)) 
		      {
		         break;
		      }
		      else {
		         before = pointy;
		         pointy = pointy.next;
		      }
		   }
		   if (pointy == null) {  
		      return false;
		   }
		   if (pointy == null) { 
		      return true;
		   }

		   T cutie = before.data;
		   before.data = pointy.data;
		   pointy.data = cutie;
		   
		   return true;
	   }
	
}
