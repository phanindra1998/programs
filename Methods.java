import java.util.Scanner;
public class Methods {
    public static void main(String[] args)
    {
        name();
        age();
        name();
    }
    public static void name()
    {
      System.out.println("enter ur name");
      Scanner input=new Scanner(System.in);
      String name=input.next();
        System.out.println("my  name is "+name);
    }
    public static void age()
    {
        System.out.println("enter ur age");
        Scanner input=new Scanner(System.in);
        int age=input.nextInt();
        System.out.println("my  AGE is "+age);
    }
}
