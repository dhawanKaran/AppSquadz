import java.util.*;

public class FinalArray
{
    public static void main(String[] args)
    {
        final int z[] = {10,20,30};
        int y[] = {100,200,300};
        
        //z=y;

        System.out.println(z[0]);
        z[0] = 10000;
        System.out.println(z[0]); 
    }
}