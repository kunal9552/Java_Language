import java.util.*;

public class Array6 
{
    public static boolean CheckNum(int Arr[],int iNo)
    {
        int iCnt = 0;
        boolean flag = false;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                flag = true;
            }
            else
            {
                continue;
            }
        }
        return flag;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int N = 0;
        int iNum = 0;
        boolean bRet = false;

        System.out.println("Enter the number of Elements : ");
        N = sobj.nextInt();

        int Arr[] = new int[N];
        System.out.println("Enter Elements : ");

        for(int i = 0; i < N; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        System.out.println("Enter the Number : ");
        iNum = sobj.nextInt();

        bRet = CheckNum(Arr,iNum);
        if(bRet == true)
        {
            System.out.println("Number is present");
        }
        else
        {
            System.out.println("Number is not present");
        }

        sobj.close();
    }   
}
