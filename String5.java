import java.util.*;

 class Reverse
{
    public String string;

    public Reverse(String str)
    {
        this.string = str;
    }

    public void RevStr()
    {
        int i = 0;
        char Arr[] = string.toCharArray();

        for(i = (string.length()-1); i >= 0 ; i--)
        {
            System.out.print(Arr[i]);
        }
    }
}

public class String5
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;

        System.out.println("Enter the string : ");
        str = sobj.nextLine();

        Reverse robj = new Reverse(str);
        robj.RevStr();


        sobj.close();
    }
}
