import java.util.*;

class SmallChar
{
	public String Strng;

	public SmallChar(String str)
	{
		this.Strng = str;
	}
	
	public void CountSmall()
	{
		int iCnt = 0;
		char Arr[] = Strng.toCharArray();
		int i = 0;
		
		for(i= 0; i < Strng.length();i++)
		{
			if((Arr[i] >= 'a') && (Arr[i]<='z'))
			{
				iCnt++;
			}
		}
		System.out.println("the number of small characters : "+iCnt);
	}
}

class String2
{
	public static void main(String Arg[])
	{
		Scanner sobj = new Scanner(System.in);
		String str = null;
		
		System.out.println("Enter the String : ");
		str = sobj.nextLine();
		
		SmallChar cobj = new SmallChar(str);
		cobj.CountSmall();
		
		sobj.close();
	}
}