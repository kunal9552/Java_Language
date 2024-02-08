import java.util.*;

public class Numbers3 
{
    public static int CountDigit(int no)
    {
        int iDigit = 0;
        int Count = 0;

        while(no != 0)
        {
            iDigit = no % 10;
            if((iDigit > 3) && (iDigit < 7))
            {
                Count++;
            }
            no = no / 10;
        }
        return Count;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int Num = 0;
        int iRet = 0;

        System.out.println("Enter the  number : ");
        Num = sobj.nextInt();

        iRet = CountDigit(Num);

        System.out.println("Count of Digit between 3 and 7 is : "+iRet);

        sobj.close();
    }
}
