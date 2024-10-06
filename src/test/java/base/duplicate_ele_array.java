package base;

public class duplicate_ele_array {

	public static void main(String[] args) {
		int []a= {12,23,45,12,435,65,13,455,12,455,23,45};
		int len=a.length;
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicateno"+a[i]);
				}
			}
		}

	}

}
