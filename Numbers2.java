
import java.util.*;

public class Numbers2
{
    public static int CountOddDigits(int No)
    {
        int iDigit = 0;
        int Count = 0;

        while(No != 0)
        {
            iDigit = No % 10;
            if((iDigit % 2) != 0)
            {
                Count++;
            }
            No = No / 10;
        }
        return Count;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int Num = 0;
        int iRet = 0;
        System.out.println("Enter the number : ");
        Num = sobj.nextInt();

        iRet = CountOddDigits(Num);
        System.out.println("Count of odd is : "+iRet);
        sobj.close();
    }
}
