
public class StringNode {
	  public String data;
	  public StringNode next;

	  public StringNode(String data, StringNode next) {
	      this.data = data;
	      this.next = next;
	   }

	  public String toString() {
	      return data;
	   }
	  
	  // LinkedList Problem 3
	  //Implement a method that will search a given linked list 
	  //for a target string, and return the number of occurrences of the target:
	  public static int numberOfOccurrences(StringNode front, String target) 
	  {
		  int counter = 0;
		  for(StringNode start = front; start != null; start = start.next)
		  {
			  if(start.data.equals(target)) {
				  counter++;
			  }
			  else
			  {
				  counter += 0;
			  }
		  }
		  return counter;
	  }
	  
	  // LinkedList Problem 5
	  //With the same StringNode definition as in the previous problem, 
	  //implement a method that will delete all occurrences of a given 
	  //target string from a linked list, and return a pointer to the 
	  //first node of the resulting linked list
	  
	  public static StringNode deleteAllOccurrences(StringNode front, String target)
	  {
		  if(front == null)
		  {
			  return null;
		  }
		  
		  StringNode start = front;
		  StringNode before = null;
		  
		  while (start != null)
		  {
			  if(start.equals(target))
			  {
				  if(before == null)
				  {
					  front = start.next;
					  //this happens only if the target is the first node
				  }
				  else {
			            before.next = start.next;
			         }
			      }
			      else {
			         before = start;
			      }
			      start = start.next;
			   }
			   return front;
			  }
	  
	  //LinkedList Problem 6
	  //Implement a (NON-RECURSIVE) method to find the common elements 
	  //in two sorted linked lists, and return the common elements in 
	  //sorted order in a NEW linked list. The original linked lists should not be modified.
	  
	  public IntNode commonElements(IntNode frontL1, IntNode frontL2) 
	  {//used help from solutions sheet
		   IntNode first = null;
		   IntNode last = null;
		   while (frontL1 != null && frontL2 != null) {
		      if (frontL1.data < frontL2.data) { //comparing size of linkedlist to use the smaller one first
		         frontL1 = frontL1.next;
		      }
		      else if (frontL1.data > frontL2.data) {
		         frontL2 = frontL2.next;
		      }
		      else {
		         IntNode ptr = new IntNode(frontL1.data, null);
		         if (last != null) {
		            last.next = ptr;
		         }
		         else {
		            first = ptr;
		         }
		         last = ptr;
		         frontL1 = frontL1.next;
		         frontL2 = frontL2.next;
		      }
		   }
		   return first;
	  } 
	  
	}