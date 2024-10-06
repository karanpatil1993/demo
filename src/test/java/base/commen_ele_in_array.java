package base;

public class commen_ele_in_array {
public static void main(String []args) {
	int[]arr1= {1,2,3,4,5,6,7,8,9,0};
	int[]arr2= {12,2,13,14,15,3};
	int common;
	for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
			if(arr1[i]==arr2[j]) {
				System.out.println("The duplicate elements are"+arr1[i]);
			}
		}
	}
}
}
