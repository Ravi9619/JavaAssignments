public class PrintDuplicate {
	
	public static void main(String[] args)
	{
		String str = "Print Duplicate Characters";
		int count;
		
		char[] str1 = str.toCharArray();
		
		System.out.println("Printed Duplicate characters: ");
		
		for(int i=0;i<str1.length;i++)
		{
			count = 1;
			for(int j=i+1;j<str1.length;j++)
			{
				if(str1[i] == str1[j])
				{
					if(str1[j] != '0')
					{
						count++;
						str1[j] = '0';
					}
				}
			}
			if(count > 1 && str1[i]!='0')
			{
				System.out.print(str1[i]+" "+count+" ");
				System.out.println();
			}
		}
	}
}