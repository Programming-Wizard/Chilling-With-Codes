class a1{
	int r1;
	int r2;
	private int s;
//	private can only be accessed in the class it is defined in and not other class only if get or set is used
	protected int c;
//	 protected can only be not accessed in other packages which is not the case yet cause we are not yet dealing packages ..
	void a(int i ) {
//		this.c = 3; //we can directly assign values too
		c = i; //assigning values using call by value
	}
	void b(int j) {
//		this.s = 3;
//		s = setS(j); //setter for 's' variable
		s = j;
	}
	void c() {
		r1 = c * c * c;
//		r2 = getS() * getS(); //getter for r2 variable
		r2 = s * s;
		
	}
	
//	****define get and set in the same class in-where the private variable or method has been defined****
	
//	public int getS() {
//		return s;
//	}
//	public void setS(int s) {
//		this.s = s;
//	}
// 	getter and setter for 's'
}
	class show1 extends a1{
	void display() {
		System.out.println(r1+" = cube");
		System.out.println(r2+" = square");
		System.out.println(c);
//		System.out.println(s); //gives compile time error
//		System.out.println(getS());// using getter to show value of 's' variable
	}
	
}

public class access_control_and_explaination {
	public static void main(String[] args) {
		show1 obj1 = new show1();
		obj1.a(3);
		obj1.b(3);
		obj1.c();
		obj1.display();
	}

}
