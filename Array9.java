import java.util.*;

class Range
{
    public int Arr[];
    public int From;
    public int upto;
    
    public Range(int Brr[],int iNo1, int iNo2)
    {
        this.Arr = Brr;
        this.From = iNo1;
        this.upto = iNo2;
    }

    public void DisplayNums()
    {
        int iCnt = 0;
        System.out.print("Number in Range "+From+" To "+upto+" Are : ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] > From) && (Arr[iCnt]< upto))
            {
                System.out.print(" "+Arr[iCnt]+" ");
            }
        }
    }

}

public class Array9 
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int N = 0;
        int Start = 0;
        int End = 0;

        System.out.println("Enter the number of Elements : ");
        N = sobj.nextInt();

        int Arr[] = new int[N];
        System.out.println("Enter Elements : ");

        for(int i = 0; i < N; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the Start : ");
        Start = sobj.nextInt();

        System.out.println("Enter the end : ");
        End = sobj.nextInt();
        
        Range robj = new Range(Arr,Start,End);

        robj.DisplayNums();

        sobj.close();
    }
}