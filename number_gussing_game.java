import java.util.Scanner;
public class number_gussing_game {

   class player{

       int gussp;


       void getGussp() {
           Scanner input = new Scanner(System.in);
           System.out.println("enter your number");
            gussp = input.nextInt();

       }
   }

    public void startgame() throws java.io.IOException {
        player p1 = new player();
        p1.gussp = 0;

        int target = (int) (10 * Math.random());
        System.out.println("im thinking of a number between 1 - 10");
        int x,z;
        z=5;
        for (x=0;x<z; x++){

            p1.getGussp();
            int gussp1 = p1.gussp;
            System.out.println("guss p1 is:" + gussp1);
            if (gussp1 == target) {
                System.out.println("you win");
            }
            if ( gussp1>target){
                System.out.println(" your number is biger than my number ");
            } else if (gussp1<target) {
                System.out.println(" your number is smaller than my number ");

            }

        }
    }
}
 class gameluncher{
    public static void main(String[]args) throws java.io.IOException{
        number_gussing_game game = new number_gussing_game();
        game.startgame();
    }
}
