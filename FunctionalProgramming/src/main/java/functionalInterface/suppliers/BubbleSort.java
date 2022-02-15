package functionalInterface.suppliers;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args) {
        int a [] ={1,2,4,3,6,7,8,5};
        for (int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for (int n:a)
        {
            System.out.println(n);

        }

        System.out.println("String operation ");
        String str = "prbhakar    suhel   sikha";
        String [] newStr = str.split("\\s+");
        System.out.println(Arrays.toString(newStr));
        System.out.println(newStr.length);
    }
}
