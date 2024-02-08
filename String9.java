import java.util.*;

class rev
{
    public String string1;

    public rev(String str1)
    {
        this.string1 = str1;
    }

    public void CheckString()
    {
        char Arr[] = string1.toCharArray();
        int iCnt = 0;

       for(iCnt = 0; iCnt < Arr.length ; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                Arr[iCnt] = (char) (Arr[iCnt]-32);
            }
            else
            {
                Arr[iCnt] =(char) (Arr[iCnt]+32);
            }
        }

        for(int i = (Arr.length-1); i >= 0; i--)
        {
            System.out.print(Arr[i]);
        }
    }
}


public class String9 
{
     public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        String str1 = null;

        System.out.println("Enter String 1 : ");
        str1 = sobj.nextLine();

        rev cobj = new rev(str1);
        cobj.CheckString();

        sobj.close();
    }
}
