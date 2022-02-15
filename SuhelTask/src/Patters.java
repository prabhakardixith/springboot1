import java.util.Arrays;
import java.util.Iterator;

public class Patters 
{

	public static void main(String[] args) 
	{
		String value = "a12b3c";
		char[] charValue = value.toCharArray();
		int numberCount = 0;
		int charCount = 0;
		char [] numers = new char[value.length()/2];
		char [] chars = new char[value.length()/2];
		for(int i=0;i<charValue.length;i++)
		{
			if(charValue[i] >= 48 && charValue[i] <= 57)
			{
//				System.out.println("number : "+charValue[i]);
				numberCount++;
			}
			else
			{
//				System.out.println("char : "+charValue[i]);
				charCount++;
			}
			
		}
		if(charCount == numberCount)
		{
			int n=0;
			int c=0;
			for(int i=0;i<charValue.length;i++)
			{
				if(charValue[i] >= 48 && charValue[i] <= 57)
				{
					numers[n] = charValue[i];
					n++;
				}
				else
				{
					chars[c]= charValue[i];
					c++;
				}

			}
			String newString ="";
			n=0;
			c=0;
		for(int i=0;i<value.length();i++)
		{
			if(charValue[i] >= 48 && charValue[i] <= 57)
			{
				newString=newString+chars[c];
				c++;
			}
			else {
				newString=newString+numers[n];
				n++;
			}
		}
			System.out.println(newString);
		}
		else
		{
			System.out.println("not equal");
		}

	}

}
