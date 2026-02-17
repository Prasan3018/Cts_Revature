package practice_java;

class India{
	
	String independence = "aug 15";
	
	India(String name){
		System.out.println(name);
	}
	
	void places(){
		System.out.println("Welcome to Taj Mahal");
	}
}

class TamilNadu extends India{
	TamilNadu(){
		super("virat");
		super.places();
		System.out.println("This is TamilNadu");
		System.out.println(super.independence);
	}
}

public class SuperKeywordDemo {

	public static void main(String[] args) {
		TamilNadu t1 = new TamilNadu();

	}

}
