
public class PalindomeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "2552";
		String copys = "";
		
//		System.out.println(s);
//		System.out.println(copys);
				
		for(int i=s.length()-1;i>=0;i--)
		{
			copys += s.charAt(i);
		}
		if (s.equals(copys)) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}