
public class CountVowelsConsonantsCharacter {

	public static void main(String[] args) {
		
		String s = "This is sentence where we calculate no. of vowels, consonant and special character";
		
		int vowels = 0, consonants = 0, character = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if((ch >= 'a' && ch<='z') || (ch >='A' && ch<='Z'))
			{
				if((ch == 'a' || ch == 'e' || ch == 'i' ||
						ch == 'o' || ch == 'u' || ch == 'A' ||
						ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
					{
						vowels++;
					}
					else 
					{
						consonants++;
					}
			}
			else if(!(ch >='0' && ch <='9'))
				{
					character++;
					System.out.print(ch+ " ");
				}

		}
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonant: " + consonants);
        System.out.println("Special Character: " + character);
	}

}