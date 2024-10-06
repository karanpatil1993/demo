package operators;

public class ternaryop {

	public static void main(String[] args) {
		int a=23,b=45,c=46,max,max1;
		
		max=(a>b)? a:b;
		System.out.println(max);
		
		max1=(a>b)?(a>c?a:c):(b>c?b:c);
		
		
	}

}
