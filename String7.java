import java.util.*;

class checkString
{
    public String string1;
    public String string2;

    public checkString(String str1, String str2)
    {
        this.string1 = str1;
        this.string2 = str2;
    }

    public  boolean check()
    {
        char Arr[] = string1.toCharArray();
        char Brr[] = string2.toCharArray();
        boolean flag = true;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Brr.length != Arr.length)
            {
                flag = false;
                break;
            }
        }
        return flag;

    }
}

public class String7
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        String str1 = null;
        String str2 = null;
        boolean bRet = false;

        System.out.println("Enter String 1 : ");
        str1 = sobj.nextLine();

        System.out.println("Enter String 2 : ");
        str2 = sobj.nextLine();

        checkString cobj = new checkString(str1,str2);
        bRet = cobj.check();

        if(bRet == true)
        {
            System.out.println("Strings are same");
        }
        else
        {
            System.out.println("Strings not same");
        }
        sobj.close();
    }
}
