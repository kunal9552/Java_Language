import java.util.*;

class FirstOcc
{
    public int Arr[];
    public int Number;

    public FirstOcc(int Brr[],int iNo)
    {
        this.Arr = Brr;
        this.Number = iNo;
    }

    public int Occ()
    {
        int iCnt = 0;
        int temp = -1;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == Number)
            {
                temp = iCnt;
                break;
            }
            
        }
        return temp;
    }
}

public class Array7 
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int N = 0;
        int Num = 0;
        int iRet = 0;

        System.out.println("Enter the number of elements : ");
        N = sobj.nextInt();

        int Arr[] = new int[N];

        System.out.println("Enter Elements : ");
        for(int i = 0; i < N; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the number : ");
        Num = sobj.nextInt();

        FirstOcc fobj = new FirstOcc(Arr, Num);
        iRet = fobj.Occ();

        System.out.println("First occurence is : "+iRet);

        sobj.close();
    }
}
