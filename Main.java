package hack.com;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Character> st  = new Stack();
		String expr = new String("(({)})");
		
		for (Character el:expr.toCharArray() ) {
			if (el == '(' || el == '[' || el == '{') {
				st.push(el);
			}
			else if (el == ')' || el == ']' || el == '}') {
					if (el == ')') {
						if (st.peek() == '(')
							st.pop();
					}
					else if (el == ']') {
						if (st.peek() == '[')
							st.pop();
					}
					else if (el == '}') {
						if (st.peek() == '{')
							st.pop();
					}
			}
		}
		
		if (st.size() == 0) {
			System.out.println("Is balance");
		}else {
			System.out.println("Not balanced");
		}
		
	}

}
