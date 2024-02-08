import java.util.*;

class Vowel
{
    public String string;
    
    public Vowel(String str)
    {
        this.string = str;
    }

    public boolean CheckVowel()
    {
        int i = 0;
        char Arr[] = string.toCharArray();
        boolean flag = false;

        for(i = 0; i < string.length(); i++)
        {
            if((Arr[i] == 'a')||(Arr[i] == 'e')||(Arr[i] == 'i')||(Arr[i] == 'o')||(Arr[i] == 'u'))
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
}

public class String4 
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        boolean bRet = false;

        System.out.println("Enter String : ");
        str = sobj.nextLine();

        Vowel cobj = new Vowel(str);
        bRet = cobj.CheckVowel();
        if(bRet == true)
        {
            System.out.println("String contain vowel\n");
        }
        else
        {
            System.out.println("Does not contain vowel\n");
        }

        sobj.close();
    }   
}
