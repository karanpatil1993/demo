package operators;

public class largestofthree {

	public static void main(String[] args) {
		int a=12,b=23,c=89;
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}else {
				System.out.println(c);
				
			}
		}else {
			if(b>c) {
				System.out.println(b);
			}
			
		}

	}

}
