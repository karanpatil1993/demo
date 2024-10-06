package base;

public class constoverload {
String name;
int j;
int i;
constoverload(int id,String name){
	i=id;
	name=name;
	
}
constoverload(String name){
	name=name;
	
}
void display() {
	System.out.println(i+" "+name+" "+j);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constoverload s1=new constoverload(10,"ka");
		constoverload s2=new constoverload("karan");
	s1.display();
	s2.display();
	}

}
//constructor name must be same as class name
//constructor d not have return type
//a constructor should not be static,abstractract,final,synchronized
