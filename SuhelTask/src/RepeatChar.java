import java.util.stream.Stream;
//abcdefghijklmnopqrstuvwxyz
public class RepeatChar
{
    public static void main(String[] args) {
        StringBuffer str =new StringBuffer("cabcabcab");
        int count =0;
        char c = ' ';
        for (int i = 0;i<str.length(); i++) {
            count=0;
           c = str.charAt(i);
            for (int j =0;j<str.length();j++) {
                if(c == str.charAt(j)) {
                    count++;
                }
            }
            if(count >=3) {
                System.out.println(c);
                i = str.length();
            }
        }
        //if char repeatation is lessthan 3
        if(count < 3) {
            System.out.println("no character found");
        }

    }
}
