import java.util.*;

class SmallChar
{
	public String Strng;

	public SmallChar(String str)
	{
		this.Strng = str;
	}
	
	public int CountSmall()
	{
		int iCntsmall = 0;
		int iCntCap = 0;
		char Arr[] = Strng.toCharArray();
		int i = 0;
		
		for(i= 0; i < Strng.length();i++)
		{
			if((Arr[i] >= 'a') && (Arr[i]<='z'))
			{
				iCntsmall++;
			}
			else
			{
				iCntCap++;
			}
		}
		return (iCntCap - iCntsmall);
	}
}

class String3
{
	public static void main(String Arg[])
	{
		Scanner sobj = new Scanner(System.in);
		String str = null;
		int iRet = 0;
		
		System.out.println("Enter the String : ");
		str = sobj.nextLine();
		
		SmallChar cobj = new SmallChar(str);
		iRet = cobj.CountSmall();
		
		System.out.println("Diffrence is : "+iRet);
		sobj.close();
	}
}