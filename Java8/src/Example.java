@FunctionalInterface
interface MyFunctionalInterface {

	//A method with no parameter
    public String sayHello();
}
public class Example {
static int sum = 0;

   public static void main(String args[]) {
        // lambda expression
    	/*MyFunctionalInterface msg = () -> {
    		return "Hello";
    	};
        System.out.println(msg.sayHello());*/
	   int a=10;
	   int b=20;
	   sum+=a/2;
	   System.out.println("Sum===>"+sum);
	   
    }
}