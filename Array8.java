import java.util.*;

class LastOcc
{
    public int Arr[];
    public int Number;

    public LastOcc(int Brr[],int iNo)
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
            }
        }
        return temp;
    }
}
public class Array8 
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

        LastOcc lobj = new LastOcc(Arr,Num);
        iRet = lobj.Occ();

        System.out.println("Last occ of the number is : "+iRet);

        sobj.close();
    }

}
