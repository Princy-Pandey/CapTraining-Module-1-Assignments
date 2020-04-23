package LabAssignment6_4;

public class Vowels {
	public String checkVowel(String s)
	{
		String newWord="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int j;
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U' && ch!=' ')
			{
				if(ch=='z')
				{
					ch='a';
				}
				else if(ch=='Z')
				{
					ch='A';
				}
				else
				{
					j=ch+1;
					ch=(char)j;
				}
			}
			newWord=newWord+ch;
		}
		return newWord;
	}

}
