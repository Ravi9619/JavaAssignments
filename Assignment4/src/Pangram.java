
public class Pangram {

	public static void main(String[] args) {

		String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		String s2 = "";
		
		boolean flag = false;
		
		//Convert to Lowercase
		for(int i=0;i < s1.length();i++)
		{
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
				s2 += (char)((s1.charAt(i))+32);
			}
		}
		
		char[] ch = s2.toCharArray();
		
		int[] arr = new int[26];
		
		for(int i=0;i<ch.length;i++)
		{
			int index = ch[i]-97;
			arr[index]++;
		}
		
		//Traversing through array for checking o 
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				System.out.println("It's not pangram");
				flag = true;
			}
		}
		if(flag==false)
		{
			System.out.println("It's panagram");
		}
	}

}