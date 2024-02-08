import java.util.*;

class Multiply
{
    public int Arr[];
    public int Number;

    public Multiply(int Brr[])
    {
        this.Arr = Brr;
    }

    public int OddMult()
    {
        int iCnt = 0;
        int Ans = 1;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] % 2) != 0 )
            {
                Ans = Ans * Arr[iCnt];
            }
            else
            {
                Ans = 0;
            }
        }
        return Ans;
    }
}
public class Array10
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int N = 0;
        int iRet = 0; 

        System.out.println("Enter the number of elements : ");
        N = sobj.nextInt();

        int Arr[] = new int[N];

        System.out.println("Enter Elements : ");
        for(int i = 0; i < N; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Multiply lobj = new Multiply(Arr);
        iRet = lobj.OddMult();

        System.out.println("Multiplication of Odd elements is : "+iRet);

        sobj.close();
    }

}
