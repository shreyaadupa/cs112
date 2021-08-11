import java.util.NoSuchElementException;
public class Stack {
	   public Stack() {
		      //
		   }

		   public push(T item) {
		      //
		   }

		   public T pop() throws NoSuchElementException {
		      //
		   }

		   public T peek() throws NoSuchElementException {
		      //
		   }

		   public boolean isEmpty() {
		      //
		   }

		   public void clear(T item) {
		      //
		   }

		   public int size(T item) {
		      //
		   }
		   
		   
		   //Stack Problem 1 
		   //Implement the following client method to return the number of items given in the stack. 
		   public static <T> int size(Stack<T> S)
		   {
			   int counter = 0;
			   Stack<T> baby = new Stack<>();
			   
			   if(S.isEmpty() == true)
			   {
				   return 0;
			   }
			   
			   while(S.isEmpty() == false)
			   {
				   baby.push(S.pop());
				   counter += 1;
			   }
			   
			   while(baby.isEmpty == false)
			   {
				   S.push(baby.pop());
			   }
			   
			   return counter;
			   
		   }
		   
		   //Stack Problem 2
		   //Implement a method to evaluate a postfix expression. 
		   //The expression is a string which contains either 
		   //single-digit numbers (0-9), or the operators +, -, *, and /, 
		   //and nothing else. There is exactly one space between every two characters. 
		   //The string has no leading spaces and no trailing spaces. 
		   //You may assume that the input expression is not empty, and is correctly formatted as above.
		   public static float postfixEvaluate(String expr) 
		   {
			   Stack<Float> posty = new Stack<>();
			   
			   for(int i = 0; i<expr.length(); i++)
			   {
				   char chary = expr.charAt(i);
				   if(chary == '+' || chary == '-' || chary == '/' || chary == '*')
				   {
					   float first = posty.pop();
					   float second = posty.pop();
					   //for this switch, case part I got help from the solutions
					   switch (chary) {
			            case '+':
			               posty.push(first + second);
			            case '-':
			               posty.push(first - second);
			            case '*':
			               posty.push(first * second);
			            case '/':
			               posty.push(first / second);
				   }
					   continue;
			   }
				   posty.push((float) Character.digit(chary, 10));
		   }
			   return posty.pop();
}
		   
}