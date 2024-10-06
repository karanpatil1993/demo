package base;

public class duplicates {

	public static void main(String[] args) {
		String str="karanisgoodinjaaavaa";
		char[]arr=str.toCharArray();
		int len=arr.length;
			StringBuilder sb3=new StringBuilder();
			
			for (int i = 0; i < len; i++) {
				boolean repeted=false;
				for (int j = i+1; j < len; j++) {
				if (arr[i]==arr[j]) {
					repeted=true;
					break;
					}}
				if(!repeted) {
					sb3.append(arr[i]);
				}
					
				}System.out.println(sb3);
				
			}

		}


