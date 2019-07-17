public class Move{
	public static void main(String[] args){
		System.out.println(decToHex(32));
	}
	public static String decToHex(int n){
		String str ="";
		String str1="";
		if(n<16){
			return ""+Transfer(n);
		}
		while(n>0){
			str=Transfer(n%16);
			n=n/16;
			str1=str+str1;
		}
		return str1;
	}
	public static String Transfer(int a){
		switch(a){
			case 10:
				return "A";
			case 11:
				return "B";
			case 12:
				return "c";
			case 13:
				return "D";
			case 14:
				return "E";
			case 15:
				return "F";
			default:
				break;
		}
	return a+"";
	}
}