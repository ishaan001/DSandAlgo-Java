package stack;

public class StackUsingArrayClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingArray st = new StackUsingArray(5);
		StackUsingArray st1 = new StackUsingArray();
		
		//st.push(20);
		st.display();
		for(int i= 1; i<=5;i++) {
			st.push(i*10);
		}
		st.display();
		System.out.println(st.topVal());
	}

}
