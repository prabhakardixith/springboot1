public class SingletoneClass
{
     static private SingletoneClass singletoneClass = null;
    private SingletoneClass()
    {
        System.out.println("hello bro");
    }

    public static SingletoneClass getInstance()
    {
        if(singletoneClass == null) {
           singletoneClass= new SingletoneClass();
        }
        return singletoneClass;
    }
}

class Get
{
    public static void main(String[] args) {
        SingletoneClass s1 = SingletoneClass.getInstance();
        System.out.println(s1);

        SingletoneClass s2 = SingletoneClass.getInstance();
        System.out.println(s2);
    }
}
