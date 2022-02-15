import java.util.Scanner;

public class Kill
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int num = sc.nextInt();
        //System.out.println("number : "+num);
        if(num<2)
        {
            System.out.println("input must be greater than 1");
        }
        else if(num%2 != 0)
        {
            System.out.println("killer is :"+num);
        }
        else
        {
            //1-2 3-4 5-6
            //1-3 5-1
            //5

            //1-2 3-4
            //1-3 =1

            //1-2 3-4 5-6 7-8
            //1-3 5-7
            //1

            //1-2 3-4 5-6 7-8 9-10
            //1-3 5-7
            //9-1 5-9
            //5

            //1-2 3-4 5-6 7-8 9-10 11-12
            //1-3 5-7 9-11
            //1-5 9-1
            //9
                System.out.println("killer is :"+(num));
        }
    }
}
