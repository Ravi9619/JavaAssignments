
public class MaximumCharacterString {

	public static void main(String[] args) {

		String s1 = "Java is one of the most popular language";
		
		int[] freq = new int[s1.length()];
		char minChar = s1.charAt(0),maxChar = s1.charAt(0);
		int min,max;
		
		//Convert string to character Array
		char[] ch = s1.toCharArray();
		
		//Count word and store in frequency array
		for(int i=0;i<ch.length;i++)
		{
			freq[i] = 1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ' && ch[i]!='0')
				{
					freq[i]++;
					
					ch[j] = '0';
				}
			}
		}
		
		min = max = freq[0];
		
		//Determine min and max no of charcters
		for(int i=0;i<freq.length;i++)
		{
			if(min > freq[i] && freq[i]!='0')
			{
				min = freq[i];
				minChar = ch[i];
			}
			if(max < freq[i] && freq[i]!='0')
			{
				max = freq[i];
				maxChar = ch[i];
			}
		}
		//Print characters
		System.out.println("Minimum Character: "+minChar);
		System.out.println("Maximum Character: "+maxChar);
	}

}