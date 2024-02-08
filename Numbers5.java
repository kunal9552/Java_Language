import java.util.*;
public class Numbers5 
{
    public static int Diff(int iNo)
    {
        int iDigit = 0;
        int SumEvenDigit = 0;
        int SumOddDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) == 0)
            {
                SumEvenDigit = SumEvenDigit + iDigit;
            }
            else
            {
                SumOddDigit = SumOddDigit + iDigit;
            }
            iNo = iNo / 10;
        }
        return (SumEvenDigit - SumOddDigit);
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int Num = 0;
        int iRet = 0;

        System.out.println("Enter the number : ");
        Num = sobj.nextInt();

        iRet = Diff(Num);

        System.out.println("Difference of even and Odd digit is : "+iRet);

        sobj.close();
    }
}
