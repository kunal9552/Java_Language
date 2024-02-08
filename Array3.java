import java.util.*;

public class Array3 
{
     public static void Display(int Brr[])
    {
        int iCnt = 0;

        System.out.println("numbers Even and divisible by 5 are : ");
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            if(((Brr[iCnt] % 5)) == 0 && (Brr[iCnt] % 2)==0)
            {
                System.out.println(Brr[iCnt]);
            }  
        }
       
    }
    public static void main(String Arg[])
    {
       
        Scanner sobj = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter the size of array : ");
        n = sobj.nextInt();

        int Arr[] = new int[n];
        System.out.println("Enetr the number of elements : ");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Display(Arr);
        sobj.close();
    }
}
