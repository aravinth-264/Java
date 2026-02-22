public class MethodsOverloading //methodsoverloading means use same name of methods with different return type(eg int,double,...)
{
    public static void main(String[] args)
    {
        System.out.println(multi(10,20));
        System.out.println(multi(10.1,20.1));
    }
    public static int multi(int a,int b)
    {
        return a*b;
    }
    public static double multi(double a,double b)
    {
        return a*b;
    }
}
