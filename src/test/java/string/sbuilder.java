	package string;
	
	public class sbuilder {
	
		public static void main(String[] args) {
			StringBuilder sb=new StringBuilder();
			sb.append("karan");
			sb.append(" patil");
			System.out.println(sb);
			sb.setCharAt(0,'K');
			System.out.println(sb);
			sb.insert(0,'K');
			System.out.println(sb);
		}
	
	}
