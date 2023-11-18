# java-calculator

import java.util.Scanner;
class calclator {


    void add (int x, int y){

        System.out.println(x+y);

    }
    void minus (int x, int y){

        System.out.println(x-y);

    }
    void multi (int x, int y){

        System.out.println(x*y);

    }
    void devision (int x, int y){

        System.out.println(x/y);

    }
    void remain (int x, int y){

        System.out.println(x%y);

    }

    }

 class run {
     public static void main(String[] args)  {
         int x,y;
         Scanner input = new Scanner(System.in);
         System.out.println("enter your first num");
         x = input.nextInt();
         System.out.println("choose your second number");
         y = input.nextInt();
         System.out.println("1.+ 2.- 3.* 4./ 5.%");
         calclator user_op= new calclator();
         char op = input.next().charAt(0);

         switch (op){
             case '+':
                 user_op.add(x,y);
                 break;
             case'-':
                 user_op.minus(x,y);
                 break;
             case'*':
                 user_op.multi(x,y);
                 break;
             case '/':
                 user_op.devision(x,y);
                 break;
             case'%':
                 user_op.remain(x,y);
                 break;
             default:
                 System.out.println("choose your oprator");
         }


     }
 }
