package base;

public class overload {

	void overload(){
		System.out.println("in the first non parameterized method");
	}
	static void overload(int a){
		System.out.println("in the second parameterized method");
	}
	void overload(double b,String c){
		System.out.println("in the third parameterized method");
	}
	static void overload(int d,int e){
		System.out.println("in the fourth static method");
	}
	public static void main(String[] args) {
	
	

	}

}
