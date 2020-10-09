import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);

        char user_input, player;
        int player_turn = 0;
        char box[] = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };

        while (player_turn < 10) {

            if (player_turn % 2 == 0)
                player = 'X';
            else
                player = 'O';

            System.out.println(" +-----+-----+-----+");
            System.out.println(" + Tic   Tac   Toe +");
            System.out.println(" +-----+-----+-----+");
            System.out.println(" +  " + box[0] + "  +  " + box[1] + "  +  " + box[2] + "  +");
            System.out.println(" +-----+-----+-----+");
            System.out.println(" +  " + box[3] + "  +  " + box[4] + "  +  " + box[5] + "  +");
            System.out.println(" +-----+-----+-----+");
            System.out.println(" +  " + box[6] + "  +  " + box[7] + "  +  " + box[8] + "  +");
            System.out.println(" +-----+-----+-----+");
            System.out.println(" +  Player " + player + " turn  +");
            System.out.println(" +-----+-----+-----+");

            // Check winning status for X
            if ((box[0] == 'X' && box[1] == 'X' && box[2] == 'X') || 
                (box[3] == 'X' && box[4] == 'X' && box[5] == 'X') || 
                (box[6] == 'X' && box[7] == 'X' && box[8] == 'X') || 
                (box[0] == 'X' && box[3] == 'X' && box[6] == 'X') || 
                (box[1] == 'X' && box[4] == 'X' && box[7] == 'X') || 
                (box[2] == 'X' && box[5] == 'X' && box[8] == 'X') || 
                (box[0] == 'X' && box[4] == 'X' && box[8] == 'X') || 
                (box[2] == 'X' && box[4] == 'X' && box[6] == 'X')) {

                System.out.println("  Player X win!!");
                myInput.close();
                System.exit(1);
            }
            
            // Check winning status for O
            if ((box[0] == 'O' && box[1] == 'O' && box[2] == 'O') || 
                (box[3] == 'O' && box[4] == 'O' && box[5] == 'O') || 
                (box[6] == 'O' && box[7] == 'O' && box[8] == 'O') || 
                (box[0] == 'O' && box[3] == 'O' && box[6] == 'O') || 
                (box[1] == 'O' && box[4] == 'O' && box[7] == 'O') || 
                (box[2] == 'O' && box[5] == 'O' && box[8] == 'O') || 
                (box[0] == 'O' && box[4] == 'O' && box[8] == 'O') || 
                (box[2] == 'O' && box[4] == 'O' && box[6] == 'O')) {

                System.out.println("  Player O win!!");
                myInput.close();
                System.exit(1);
            }

            // Declare the game is draw/out of turn!
            if (player_turn == 9) {
                System.out.println("  DRAW!!");
                myInput.close();
                System.exit(1);
            }

            System.out.println("  Choose your slot \n\tQ W E \n\tS D F \n\tZ X C ");
            user_input = myInput.next().charAt(0);
            user_input = Character.toUpperCase(user_input);

            switch (user_input) {
                case 'Q': {
                    if (box[0] == ' ') { // To check if the box is occupied or not.
                        if (player_turn % 2 == 0) // Determie which symbol turn
                            box[0] = 'X';
                        else
                            box[0] = 'O';
                    } else {
                        System.out.println("\n Box taken!");
                        player_turn--;
                    }
                    break;
                }
                case 'W': {
                    if (box[1] == ' ') { // To check if the box is occupied or not.
                        if (player_turn % 2 == 0) // Determie which symbol turn
                            box[1] = 'X';
                        else
                            box[1] = 'O';
                    } else {
                        System.out.println("\n Box taken!");
                        player_turn--;
                    }
                    break;
                }
                case 'E': {
                    if (box[2] == ' ') { // To check if the box is occupied or not.
                        if (player_turn % 2 == 0) // Determie which symbol turn
                            box[2] = 'X';
                        else
                            box[2] = 'O';
                    } else {
                        System.out.println("\n Box taken!");
                        player_turn--;
                    }
                    break;
                }
                case 'A': {
                    if (box[3] == ' ') { // To check if the box is occupied or not.
                        if (player_turn % 2 == 0) // Determie which symbol turn
                            box[3] = 'X';
                        else
                            box[3] = 'O';
                    } else {
                        System.out.println("\n Box taken!");
                        player_turn--;
                    }
                    break;
                }
                case 'S': {
                    if (box[4] == ' ') { // To check if the box is occupied or not.
                        if (player_turn % 2 == 0) // Determie which symbol turn
                            box[4] = 'X';
                        else
                            box[4] = 'O';
                    } else {
                        System.out.println("\n Box taken!");
                        player_turn--;
                    }
                    break;
                }
                case 'D': {
                    if (box[5] == ' ') { // To check if the box is occupied or not.
                        if (player_turn % 2 == 0) // Determie which symbol turn
                            box[5] = 'X';
                        else
                            box[5] = 'O';
                    } else {
                        System.out.println("\n Box taken!");
                        player_turn--;
                    }
                    break;
                }
                case 'Z': {
                    if (box[6] == ' ') { // To check if the box is occupied or not.
                        if (player_turn % 2 == 0) // Determie which symbol turn
                            box[6] = 'X';
                        else
                            box[6] = 'O';
                    } else {
                        System.out.println("\n Box taken!");
                        player_turn--;
                    }
                    break;
                }
                case 'X': {
                    if (box[7] == ' ') { // To check if the box is occupied or not.
                        if (player_turn % 2 == 0) // Determie which symbol turn
                            box[7] = 'X';
                        else
                            box[7] = 'O';
                    } else {
                        System.out.println("\n Box taken!");
                        player_turn--;
                    }
                    break;
                }
                case 'C': {
                    if (box[8] == ' ') { // To check if the box is occupied or not.
                        if (player_turn % 2 == 0) // Determie which symbol turn
                            box[8] = 'X';
                        else
                            box[8] = 'O';
                    } else {
                        System.out.println("\n Box taken!");
                        player_turn--;
                    }
                    break;
                }
                default: {
                    player_turn--;
                }
            }
            player_turn++;
        }
    }
}