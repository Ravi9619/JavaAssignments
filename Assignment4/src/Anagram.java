
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "race";
		String str1 = "cAre";
		int count = 0;
		int larger = 0;
		
		str = str.toLowerCase();
		str1 = str1.toLowerCase();
		
		char[] ch1 = str.toCharArray();
		char[] ch2 = str1.toCharArray();
		
		if(ch1.length > ch2.length)
		{
			larger = ch1.length;
		}else {
			larger = ch2.length;
		}
		
		for(int i=0;i<ch1.length-1;i++)
		{
			for(int j=1;j<ch1.length-i;j++)
			{
				if(ch1[j]<ch1[j-1])
				{
					char tempVar = ch1[j];
					ch1[j] = ch1[j-1];
					ch1[j-1] = tempVar;
				}
			}
		}
		for(int i=0;i<ch2.length-1;i++)
		{
			for(int j=1;j<ch2.length-i;j++)
			{
				if(ch2[j]<ch2[j-1])
				{
					char tempVar = ch2[j];
					ch2[j] = ch2[j-1];
					ch2[j-1] = tempVar;
				}
			}
		}
		
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch2.length;j++)
			{
				if(ch1[i] == ch2[j])
				{
					count++;
				}
			}
		}
		if(count == larger)
		{
			System.out.println("Given String is Anagram");
		}
		else {
			System.out.println("Given String is not Anagram");
		}
	}

}