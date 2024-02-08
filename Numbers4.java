import java.util.*;
public class Assignment34Que4 
{
    public static int MultDigit(int iNo)
    {
        int iDigit = 0;
        int Mult = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if( iDigit != 0)
            {
                Mult = Mult * iDigit;
            }
            iNo = iNo / 10;
        }
        return Mult;

    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int Num = 0;
        int iRet = 0;

        System.out.println("enter the number : ");
        Num = sobj.nextInt();

        iRet = MultDigit(Num);

        System.out.println("multiplication of Digits : "+iRet);

        sobj.close();
    }
}
