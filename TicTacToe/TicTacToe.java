import java.util.Scanner;

public class TicTacToe {

    public static void displayBoard(char[][] board) {
        System.out.println("\n  " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println(" ---+---+---");
        System.out.println("  " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println(" ---+---+---");
        System.out.println("  " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }

    public static boolean checkWinner(char[][] board, char mark, int turn) {

        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == mark && board[i][1] == mark && board[i][2] == mark)
                    || (board[0][i] == mark && board[1][i] == mark && board[2][i] == mark)) {

                System.out.println();
                displayBoard(board);
                System.out.println();

                if (turn == 0)
                    System.out.println("Player 1 Wins!");
                else
                    System.out.println("Player 2 Wins!");

                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == mark && board[1][1] == mark && board[2][2] == mark)
                || (board[0][2] == mark && board[1][1] == mark && board[2][0] == mark)) {

            System.out.println();
            displayBoard(board);
            System.out.println();

            if (turn == 0)
                System.out.println("Player 1 Wins!");
            else
                System.out.println("Player 2 Wins!");

            return true;
        }

        return false;
    }

    public static void tictactoe(Scanner sc) {

        int turn = 0; // 0 = Player 1, 1 = Player 2
        char[][] board = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };

        for (int i = 0; i < 9; i++) {

            displayBoard(board);

            if (turn == 0)
                System.out.print("\nPlayer 1 (X), enter your move (1-9): ");
            else
                System.out.print("\nPlayer 2 (O), enter your move (1-9): ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 9.");
                sc.next(); // clear invalid input
                i--;
                continue;
            }

            int move = sc.nextInt();

            if (move < 1 || move > 9) {
                System.out.println("Invalid input. Please enter a number between 1 and 9.");
                i--;
                continue;
            }

            char mark = (turn == 0) ? 'X' : 'O';

            int row = (move - 1) / 3;
            int col = (move - 1) % 3;

            if (board[row][col] == 'X' || board[row][col] == 'O') {
                System.out.println("Spot already taken. Choose another.");
                i--;
                continue;
            }

            board[row][col] = mark;

            if (checkWinner(board, mark, turn))
                return;

            turn = 1 - turn; // switch player
        }

        displayBoard(board);
        System.out.println("It's a draw!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int condition;

        do {
            tictactoe(sc);

            System.out.println("Do you want to continue? Yes-1, No-0");

            if (!sc.hasNextInt()) {
                sc.next();
                condition = 0;
            } else {
                condition = sc.nextInt();
            }

        } while (condition == 1);

        sc.close();
    }
}