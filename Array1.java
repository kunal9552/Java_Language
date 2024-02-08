import java.util.*;


public class Array1 
{
     public static int Diff(int Brr[])
    {
        int iCnt = 0;
        int EvenSum = 0;
        int OddSum = 0;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            if((Brr[iCnt] % 2) == 0)
            {
                EvenSum = EvenSum + Brr[iCnt];
            }  
            else
            {
                OddSum = OddSum + Brr[iCnt];
            } 
        }
        return (EvenSum- OddSum);
    }
    public static void main(String Arg[])
    {
       
        Scanner sobj = new Scanner(System.in);
        int n = 0;
        int iRet = 0;

        System.out.println("Enter the size of array : ");
        n = sobj.nextInt();

        int Arr[] = new int[n];
        System.out.println("Enetr the number of elements : ");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        iRet = Diff(Arr);

        System.out.println("the diff of even and odd numbers is : "+iRet);

        sobj.close();
    }
}
