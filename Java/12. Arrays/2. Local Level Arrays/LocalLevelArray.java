import java.util.Scanner;

public class LocalLevelArray
{
    public static void main(String... s) 
    {
        // int z[] = new int[10];
        // int z[] = {10,20,30};
        int z[];
        System.out.print("Enter the size of Array: ");
        int x1 = new Scanner(System.in).nextInt();
        z = new int[x1];
        
        for(int i=0; i< z.length; i++)
        {
            z[i] = new Scanner(System.in).nextInt();
        }

        for(int i=0; i<z.length; i++)
        {
            System.out.print(z[i]);
            System.out.print(" ");
        }
    }
}