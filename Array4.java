import java.util.*;
public class Array4 
{
    public static void  Display(int Brr[])
    {
        int i = 0;
        System.out.println("numbers divisible by 3 & 5 are : ");
        for(i = 0; i < Brr.length; i++)
        {
            if((Brr[i] % 3)== 0 && (Brr[i] % 5)==0)
            {
                System.out.println(Brr[i]);
            }
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int size = 0;
        int iCnt = 0;

        System.out.println("Enter the number of elements : ");
        size = sobj.nextInt();

        int Arr[] = new int[size];
        System.out.println("Enter the elmeents : ");

        for(iCnt = 0; iCnt < size;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        Display(Arr);

        sobj.close();
    }    
}
