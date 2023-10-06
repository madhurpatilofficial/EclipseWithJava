
public class EmpDetails implements EmpInterface{

	private SalesEmployee stk[];
	private int top;
	
	
	public EmpDetails() {
		stk = new SalesEmployee[0];
		top = 0;
	}
	public EmpDetails(int size) {
		stk = new SalesEmployee[size];
		top = -1;
	}
	
	@Override
	public void push(SalesEmployee se1) {
		if(top==stk.length-1) {
			System.out.println("Stack is full");
		}
		else {
			stk[++top] = se1;
		}
	}

	@Override
	public SalesEmployee pop() {

		if(top<1) {
			System.out.println("Stack Underflow");
			return null;
		}
		else {
			return stk[top--];
		}
	}
}
