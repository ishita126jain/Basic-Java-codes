public class Main
{
public static void main(String[] args) {
for(int i=0;i<4;i++)
    {
        for(int k=0;k<4-i;k++)
            System.out.print(" ");
        for(int j=0;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.print("\n");
    }
}
}



public class Main
{
public static void main(String[] args) {
for(int i=4;i>0;i--)
    {
        for(int k=0;k<4-i;k++)
            System.out.print(" ");
        for(int j=4;j>4-i;j--)
        {
            System.out.print("* ");
        }
        System.out.print("\n");
    }
}
}