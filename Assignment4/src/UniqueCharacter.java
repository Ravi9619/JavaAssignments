
public class UniqueCharacter {
	
	public static boolean uniqueCharacters(String str) {
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String s1 = "Duplicate Characters";
		
		if(uniqueCharacters(s1))
		{
			System.out.println("The input string "+s1+" has unique characters");
		}
		else {
			System.out.println("The input string "+s1+" has duplicate characters");
		}

	}

}