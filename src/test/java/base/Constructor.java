package base;

public class Constructor {
	
	/*Default constructor
	Constructor(){
		System.out.println("constructor is created");
	}
	public static void main(String args[]) 
	{
		
		Constructor m=new Constructor();
	}
	*/
	//parameterized constructor
	int id;  
	String name; 
	Constructor(int i,String name){
		id=i;
		name="karan";
		}
	void display() {
		System.out.println(id+""+name);
	}
	
		public static void main(String args[]) 
		{
			Constructor s1=new Constructor(100,"karan");
			Constructor s2=new Constructor(10,"kara");
		
		}	
	}

