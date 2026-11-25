package projects.chess;

public class Main {
    public static void main(String[] args) {
        String[][] board = {
                {"R", "k", "B", "Q", "K", "B", "k", "R"},
                {"P", "P", "P", "P", "P", "P", "P", "P"},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {"P", "P", "P", "P", "P", "P", "P", "P"},
                {"R", "k", "B", "Q", "K", "B", "k", "R"},
        };
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + 1 + " ");
                System.out.println("[" + String.join("  ", board[i]) + "]");
            }
        System.out.println("   a  b  c  d  e  f  g  h");
        }
    }
