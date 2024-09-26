public class Overloading {

        static void Add(int a,int b)
        {
            System.out.println(a+b);
        }
        static void Add(int a,int b,int c)
        {
            System.out.println(a+b+c);
        }
        static double Add(double a,double b)
        {
            return a+b;
        }
        static String Add(String c,String d)
        {
            return c+d;
        }
        void Add(String x,String y,String z)
        {
            System.out.println(x+y+z);
        }


}
