import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean playAgain = true;
        
        Scanner in = new Scanner(System.in);

        String yn = "";


        while (playAgain) {

            clearScreen();

            System.out.println("Player A is going first");

            String playerA = selection();

            System.out.println("Player B is up next");

            String playerB = in.nextLine();

            if (playerA.equals(playerB)) {

                System.out.println("It's a tie");

            }
            else if (playerA.equals("R") && playerB.equals("P")) {  //playerA is rock and playerB is paper
                System.out.println("Player B wins! Paper covers Rock");
            }
            else if (playerA.equals("P") && playerB.equals("R")) {  //playerB is rock and playerA is paper
                System.out.println("Player A wins! Paper covers Rock");
            }
            else if (playerA.equals("P") && playerB.equals("S")) {  //playerA is paper and playerB is scissors
                System.out.println("Player B wins! Scissors cuts Paper");
            }
            else if (playerA.equals("S") && playerB.equals("P")) {  //playerA is scissors and playerB is paper
                System.out.println("Player A wins! Scissors cuts Paper");
            }
            else if (playerA.equals("S") && playerB.equals("R")) {  //playerA is scissors and playerB is rock
                System.out.println("Player B wins! Rock breaks Scissors");
            }
            else if (playerA.equals("R") && playerB.equals("S")) {  //playerA is rock and playerB is scissors
                System.out.println("Player A wins! Rock breaks Scissors");
            }

            System.out.println("Would you like to play again? (Y/N)");

                yn = in.next().toUpperCase();

                if (yn.equals("N")) {
                    clearScreen();
                    break;

                }

        }
    }

      private static String selection() {
          Scanner in = new Scanner(System.in);
          String player = "";

          do {
              System.out.println("Please enter your choice: R, P, or S:");

              player = in.next();

          }
          while (!player.equalsIgnoreCase("R") && !player.equalsIgnoreCase("P") && !player.equalsIgnoreCase("S"));
           return player.toUpperCase();
        }
        public static void clearScreen() { //used to clear screens for clarity of selection and output

            for (int i = 0; i < 50; i++) {

                System.out.println();
            }
        }


}