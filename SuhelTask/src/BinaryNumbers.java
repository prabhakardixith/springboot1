public class BinaryNumbers
{
    public static void main(String[] args) {
        String binary = "100010000";

        int count = 0;
        int max=0;
        int check=0;
        for (int i=0;i<binary.length();i++)
        {
            if(binary.charAt(i) == '1')
            {
                for (int j=i+1;j<binary.length();j++)
                {
                    if(binary.charAt(j) == '0')
                    {
                        count++;
                        //System.out.println(binary.charAt(j));
                    }
                    else
                    {
                        check++;
                        break;
                    }

                }
                if(check != 0) {
                    if (count > max) {
                        max = count;
                    }

                }
                check=0;
                count = 0;

            }

        }
        System.out.println(max);
    }
}
