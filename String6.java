import java.util.*;

class Concat
{
    public String string1;
    public String string2;
    public int Number;

    public Concat(String str1, String str2, int iNo)
    {
        this.string1 = str1;
        this.string2 = str2;
        this.Number = iNo;
    }

    public String StringConcat()
    {
        char Brr[] = string2.toCharArray();
        int iCnt = 0;
        String Fstring = string1;

        if(Number > Brr.length)
        {
            Number = Brr.length;
        }

        for(iCnt = 0; iCnt < Number ; iCnt++)
        {
            Fstring = Fstring + Brr[iCnt];
        }
        return Fstring;
    }
}

public class String6 
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        String str1 = null;
        String str2 = null;
        String concatString = null;
        int Num = 0;

        System.out.println("Enter String 1 : ");
        str1 = sobj.nextLine();

        System.out.println("Enter String 2 : ");
        str2 = sobj.nextLine();

        System.out.println("Enter number : ");
        Num = sobj.nextInt();

        Concat cobj = new Concat(str1,str2,Num);
        concatString = cobj.StringConcat();

        System.out.println("String is : "+concatString);
        sobj.close();
    }
}
