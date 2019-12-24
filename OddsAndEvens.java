import java.util.Scanner;
import java.util.*;
public class OddsAndEvens {
    public static void main(String[] args)
    {    int flag=0;
         String chance="yes";
        System.out.println("Let’s play a game called \"Odds and Evens\"");
        System.out.print("what is ur name?");
        Scanner input=new Scanner (System.in);
        String name=input.nextLine();
        System.out.print("Hi "+name+"  which do you choose? (O)dds or (E)vens?");
        String game=input.next();
        if("Odds".startsWith(game)){
           flag=1;
            System.out.println(name+"has picked odds! The computer will be evens.");}
        else if("Evens".startsWith(game)){
           flag=2;
            System.out.println(name+" has picked evens! The computer will be odds.");}
        else
           System.out.println("wrong entry");
        System.out.println("----------------------------------------------");
        //part 2
        while(chance.equals("yes")) {
            System.out.print("How many fingers do you put out? ");
            int user = input.nextInt(6);
            Random rand = new Random();
            int computer = rand.nextInt(6);
            System.out.println("The computer plays " + computer + " \"fingers\"");
            System.out.println("----------------------------------------------");
            //part 3
            int result = user + computer;
            System.out.println(result + "=" + user + "+" + computer);
            if (result % 2 == 0) {
                System.out.println(result + "....is even");
                if (flag == 1)
                    System.out.println("that means computer wins");
                else if (flag == 2)
                    System.out.println("that means " + name + " wins");
            }
            if (result % 2 != 0) {
                System.out.println(result + "....is odd");
                if (flag == 2)
                    System.out.println("that means computer wins");
                else if (flag == 1)
                    System.out.println("that means" + name + "wins");
            }
            System.out.println("press yes if u want to continue or else press no");
            chance=input.next();
        }



    }
}
