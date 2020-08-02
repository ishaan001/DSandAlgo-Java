package stack;

public class DynamicArrayClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 
		StackUsingArray st = new DynamicStack(5);
		//st.push(20);
		st.display();
		for(int i= 1; i<=5;i++) {
			st.push(i*10);
		}
		st.display();
		System.out.println(st.topVal());
		st.push(50);
		st.display();;
	
		
	}

}
