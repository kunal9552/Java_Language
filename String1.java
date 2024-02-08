import java.util.*;

class StringCap
{
	public String strng;
	
	public StringCap(String str)
	{
		this.strng = str;
	}
	
	public void CheckCap()
	{
		int iCnt = 0;
		char Arr[] = strng.toCharArray();
		int Count = 0;
		for(iCnt = 0; iCnt < strng.length(); iCnt++)
		{
			if((Arr[iCnt] >= 'A') &&(Arr[iCnt] <= 'Z'))
			{
				Count++;
			}
		}
		System.out.println("Count of Capital is : "+Count);
	}
}

class String1
{
	public static void main(String Arg[])
	{
		Scanner sobj = new Scanner(System.in);
		String str = null; 
		
		System.out.println("Enter string : ");
		str = sobj.nextLine();
		
		StringCap cobj = new StringCap(str);
		cobj.CheckCap();
		
		sobj.close();
	}
}