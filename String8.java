import java.util.*;

class Check
{
    public String string1;
    public String string2;
    public int Number;

    public Check(String str1, String str2, int iNo)
    {
        this.string1 = str1;
        this.string2 = str2;
        this.Number = iNo;
    }

    public boolean CheckString()
    {
        char Arr[] = string1.toCharArray();
        char Brr[] = string2.toCharArray();
        int iCnt = 0;
        boolean flag = true;
        if(Number > Brr.length)
        {
            Number = Brr.length;
        }

       for(iCnt = 0; iCnt < Number ; iCnt++)
        {
            if(Arr[iCnt] != Brr[iCnt])
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
}

public class String8 
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        String str1 = null;
        String str2 = null;
        int Num = 0;
        boolean bRet = false;

        System.out.println("Enter String 1 : ");
        str1 = sobj.nextLine();

        System.out.println("Enter String 2 : ");
        str2 = sobj.nextLine();

        System.out.println("Enter number : ");
        Num = sobj.nextInt();

        Check cobj = new Check(str1,str2,Num);
        bRet = cobj.CheckString();

        if(bRet == true)
        {
            System.out.println("Contents are equal ");
        }
        else
        {
            System.out.println("Contents are not same");
        }
        sobj.close();
    }
}
