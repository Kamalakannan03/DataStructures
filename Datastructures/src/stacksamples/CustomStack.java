package stacksamples;

public class CustomStack {
	private int stackSize;
	private Object stackArr[];
	private int top;
	//GETTERS AND SETTERS
	public int getStackSize() {
		return stackSize;
	}
	public void setStackSize(int stackSize) {
		this.stackSize = stackSize;
	}
	public Object[] getArr() {
		return stackArr;
	}
	public void setArr(Object[] arr) {
		this.stackArr = arr;
	}
	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	//CONSTRUCTOR
	public CustomStack(int size) {
        this.stackSize = size;
        this.stackArr = new Object[size];
        this.top = -1;
    }
	//PUSH
	public void push(Object entry) {
		if(entry == null) {
			System.out.println("Null is not allowed to insert in stack");
			return;
		}
		this.stackArr[++top] = entry;
		System.out.println("Adding: "+stackArr[top]);
	}
	//POP
	public void pop() {
		if(!isEmpty()) {
			int temp = top;
			this.stackArr[top]= null;
			top = --temp;
		}
	   System.out.println("top: "+stackArr[top]);
	}
	//isEmpty 
	public boolean isEmpty() {
		return this.top == -1;
	}
	//isStackFull
	public boolean isStackFull() {
		return (this.stackSize-1 == top);
	}
	//Dynamic size increase
	public void dynamicSizeAdjuster() {
		if(isStackFull()) {
			Object[] newStack=new Object[stackSize*2];
			for(int i=0; i<stackSize-1; i++) {
				newStack[i] = this.stackArr[i];
			}
			this.stackSize = stackSize*2;
			this.stackArr = newStack;
		}
	}
	
	//MAIN
	 public static void main(String[] args) {
		 CustomStack stack = new CustomStack(10);
	        for(int i=1;i<10;i++){
	            stack.push(i);
	        }
	        for(int i=1;i<4;i++){
	            try {
	                stack.pop();
	            } catch (Exception e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }
	    }
	
}
