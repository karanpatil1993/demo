package practice;

public class zero_to_l {
	public static void main(String[] args) {
		int []a={1,0,2,0,3};
		int len=a.length-1;
		for(int i=len;i>=0;i--) {
			if(a[i]!=0) {
				a[len]=a[i];
				len--;
						
			}
		}for(int i=0;i<0;i++) {
			
		}
	}
}
