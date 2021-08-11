
public class IntNode {
	  
	   public int     data;
	   public IntNode next;

	   public IntNode(int data, IntNode next) {
	      this.data = data;
	      this.next = next;
	   }

	   public String toString() {
	      return data + "";
	   }
	   
	   // LinkedList Problem 1
	   //Implement a method that will add a new integer before a 
	   //target integer in the list. The method should return a 
	   //pointer/reference to the front node of the resulting list.
	   //If the target is not found, it should return front without doing anything:
	   
	   public static IntNode addBefore(IntNode front, int target, int newItem)
	   {
		   IntNode point = front;
		   IntNode before = null;
		   
		   while(point != null && point.data !=target)
		   {
			   before = point;
			   point = point.next;
		   }
		    if(point == null)
		    {
		    	return front;
		    }
		    
		    IntNode cutie = new IntNode(newItem, point);
		    if(before == null)
		    {
		    	return cutie;
		    }
		    
		    before.next = cutie;
		   
		   return front;
	   }
	   
	   // LinkedList Problem 2
	   //With the same IntNode class definition as above, 
	   //implement a method that will add a new integer before 
	   //the last item in a linked list. (In other words, the 
	   //added integer will become the second-to-last item in 
	   //the resulting linked list.) The method should return 
	   //a pointer/reference to the front node of the resulting linked list. 
	   //If the input linked list is empty, the method should return null, without doing anything.
	   
	   public static IntNode addBeforeLast(IntNode front, int item) 
	   {
		   if(front == null)
		   {
			   return null;
		   }
		   
		   IntNode before = null;
		   IntNode point = front;
		   
		   while(point.next != null)
		   {
			   before = point;
			   point = point.next;
		   }
		   
		   IntNode addling = new IntNode(item, point);
		   if(before == null)
		   {
			   return addling;
		   }
		   
		   before.next = addling;
		   
		   return front;
	   }
	   
	   // LinkedList Problem 4
	   //implement a method to delete EVERY OTHER item from an integer linked list
	   
	   public static void deleteEveryOther(IntNode front)
	   {
		   if(front == null)
		   {
			   return;
		   }
		   
		   IntNode before = front;
		   IntNode point = front.next;
		   
		   while(point != null)
		   {
			   
		   //don't completely understand code below, got from solutions
			   boolean delete = true;
			     if (delete) {
			         point = point.next;   
			         before.next = point;  
			         delete = false;      
			      }
			      else {
			         before = point;       
			         point = point.next;
			         delete = true;       
			      }
		   }
	   }
}
