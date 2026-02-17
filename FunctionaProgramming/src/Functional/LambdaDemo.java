package Functional;

public class LambdaDemo {
	
	public static void main(String[] args) {
		// without lambda
		
//		Runnable task = new Runnable() {
//			public void run() {
//				System.out.println("Helooo from task");
//			}
//		};
		
		// using lambda
		
//		Runnable task =() -> System.out.println();
		
		// with Method Reference with static method ::
//		Runnable task = LamdbaDemo::sayHello;
		
		// with Method Reference with static method;
		
		LambdaDemo lambdaDemo = new LambdaDemo();
		Runnable task = lambdaDemo ::sayHelloNonStatic;
		Thread t1 = new Thread(task);
		t1.start();
	}
	
	static void sayHello() {
		System.out.println("Hello from Task");
	}
	
	void sayHelloNonStatic() {
	System.out.println("Hello from Non static function");
	}

}
