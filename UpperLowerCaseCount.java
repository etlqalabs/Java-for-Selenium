import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

//if sctring method can be inheritted
public class UpperLowerCaseCount {
	
	public static void main(String[] args) {
		String str = "HETURAM sahu";
		int lcount=0;
		int ucount = 0;
		
		for ( int i = 0 ; i<str.length() ; i++)
		{
			if (str.charAt(i) >='A' && str.charAt(i) <='Z')
			{
				ucount ++;
				
			}
			else if (str.charAt(i) >='a' && str.charAt(i) <='z')
			{
				lcount ++;
			}
		}
		
System.out.println("lower case count :"+lcount);
System.out.println("upper case count :"+ucount);
		
		
		
		
		
		
		
		
		
	}
}
