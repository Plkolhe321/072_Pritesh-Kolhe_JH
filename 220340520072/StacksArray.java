class StacksArray{
	

public static void main(String[] args){
	
	//StacksArray sta = new StacksArray();
	Stack st = new Stack();
	
	st.push1(5);
	st.push2(10);
	st.push2(15);
	st.push1(11);
	st.push2(7);
	st.push2(40);
	
	st.pop1();
	st.pop2();
}

}

class Stack{
	
int top;	
int max=10;
int[] stack1 = new int[max/2];
int[] stack2 = new int[max/2];

	Stack(){
		top = -1;
	}
	
	void push1(int data){
		
		if(top == -1){
			System.out.println("Stack is empty.");
		}else{
			stack1[++top] = data;
		}
	}
	
	void pop1(){
		int element = 0;
		if(top >= max/2){
			System.out.println("Stack is full.");
		}else{
			element = stack1[top--];
			System.out.println("Popped element from stack1 is "+element);
		}
	}
	
	int peek1(){
		int result = 0;
		result = stack1[top];
		return result;
	}
	
	
	void push2(int data){
		
		if(top == -1){
			System.out.println("Stack is empty.");
		}else{
			stack2[++top] = data;
		}
	}
	
	void pop2(){
		int element2 = 0;
		if(top >= max/2){
			System.out.println("Stack is full.");
		}else{
			element2 = stack2[top--];
			System.out.println("Popped element from stack1 is "+element2);
		}
	}
	
	int peek2(){
		int result2 = 0;
		result2 = stack2[top];
		return result2;
	}
	
}
