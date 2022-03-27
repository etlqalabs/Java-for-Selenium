
public class FindBiggerNumber {

	public static void main(String[] args) {
		
		int a = 34;
		int b= 19;
		int c = 6;
		
		int max = c>(a>b ? a:b) ? c:(a>b ? a:b);
		
		System.out.println(max);
	}
}
