package practice_java;

public class Teacher {
	
	String myname;
	
	Teacher(){
		System.out.println("Heloo");
	}
	
	void setName(String myname) {
		this.myname = myname;
	}
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.setName("virat");
		System.out.println(t1.myname);
	}
}
