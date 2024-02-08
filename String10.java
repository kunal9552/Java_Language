import java.util.*;

class CheckRev
{
    public String string1;

    public CheckRev(String str1)
    {
        this.string1 = str1;
    }

    public boolean CheckString()
    {
        char Arr[] = string1.toCharArray();
        String reversestr= "";
        boolean flag = false;
       
       for(int i = (Arr.length-1); i >= 0; i--)
        {
            reversestr = reversestr + string1.charAt(i);
        }
        System.out.println(reversestr);
        
        if(string1.toLowerCase().equals(reversestr.toLowerCase()))
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        return flag;
    }
}


public class String10
{
     public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        String str1 = null;
        boolean bRet = false;

        System.out.println("Enter String 1 : ");
        str1 = sobj.nextLine();

        CheckRev cobj = new CheckRev(str1);
        bRet = cobj.CheckString();

        if(bRet == true)
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
        sobj.close();
    }
}
