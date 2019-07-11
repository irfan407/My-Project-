package Game;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        char a1 = ' ';
        char a2 = ' ';
        char a3 = ' ';
        char b1 = ' ';
        char b2 = ' ';
        char b3 = ' ';
        char c1 = ' ';
        char c2 = ' ';
        char c3 = ' ';
        int turn = 1;
        int y = 1;

        while (y <= 9) {
            if (turn == 1) {
                System.out.println("player 1 to enter.\n Ex: 1,2,3,4,5,6,7,8,9");
                String input = a.nextLine();

                if (input.equals("1")) {
                    if (a1 == ' ') {
                        a1 = 'X';
                        turn++;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else if (input.equals("2")) {
                    if (b1 == ' ') {
                        b1 = 'X';
                        turn++;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else if (input.equals("3")) {
                    if (c1 == ' ') {
                        c1 = 'X';
                        turn++;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else if (input.equals("4")) {
                    if (a2 == ' ') {
                        a2 = 'X';
                        turn++;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else if (input.equals("5")) {
                    if (b2 == ' ') {
                        b2 = 'X';
                        turn++;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else if (input.equals("6")) {
                    if (c2 == ' ') {
                        c2 = 'X';
                        turn++;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else if (input.equals("7")) {
                    if (a3 == ' ') {
                        a3 = 'X';
                        turn++;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else if (input.equals("8")) {
                    if (b3 == ' ') {
                        b3 = 'X';
                        turn++;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else if (input.equals("9")) {
                    if (c3 == ' ') {
                        c3 = 'X';
                        turn++;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else {
                    System.out.println("You have entered an invalid sapce please try again.");
                }
                System.out.printf(" %c | %c | %c \n", a1, b1, c1);
                System.out.printf("____________\n");
                System.out.printf(" %c | %c | %c \n", a2, b2, c2);
                System.out.printf("____________\n");
                System.out.printf(" %c | %c | %c \n", a3, b3, c3) ;
                if (a1 == 'X') {
                    if (a2 == 'X') {
                        if (a3 == 'X') {
                            System.out.println("Player 1 wins!!!");
                            System.exit(1);
                        }
                    }
                }
                if (b1 == 'X') {
                    if (b2 == 'X') {
                        if (b3 == 'X') {
                            System.out.println("Player 1 wins!!!");
                            System.exit(1);
                        }
                    }
                }
                if (c1 == 'X') {
                    if (c2 == 'X') {
                        if (c3 == 'X') {
                            System.out.println("Player 1 wins!!!");
                            System.exit(1);
                        }
                    }
                }
                if (a1 == 'X') {
                    if (b2 == 'X') {
                        if (c3 == 'X') {
                            System.out.println("Player 1 wins!!!");
                            System.exit(1);
                        }
                    }
                }
                if (a1 == 'X') {
                    if (b1 == 'X') {
                        if (c1 == 'X') {
                            System.out.println("Player 1 wins!!!");
                            System.exit(1);
                        }
                    }
                }
                if (a2 == 'X') {
                    if (b2 == 'X') {
                        if (c2 == 'X') {
                            System.out.println("Player 1 wins!!!");
                            System.exit(1);
                        }
                    }
                }
                if (a3 == 'X') {
                    if (b3 == 'X') {
                        if (c3 == 'X') {
                            System.out.println("Player 1 wins!!!");
                            System.exit(1);
                        }
                    }
                }
                if (c1 == 'X') {
                    if (b2 == 'X') {
                        if (a3 == 'X') {
                            System.out.println("Player 1 wins!!!");
                            System.exit(1);
                        }
                    }
                }


                if (y == 9) {
                    System.out.println("the game ends in a draw.");
                    System.exit(1);
                }

            }
            if (turn == 2) {
                System.out.println("player 2 "
                        + "to enter.\n Ex: 1,2,3,4,5,6,7,8,9");
                String input = a.nextLine();

                if (input.equals("1")) {
                    if (a1 == ' ') {
                        a1 = '✔';
                        turn--;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else if (input.equals("2")) {
                    if (b1 == ' ') {
                        b1 = '✔';
                        turn--;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else if (input.equals("3")) {
                    if (c1 == ' ') {
                        c1 = '✔';
                        turn--;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else if (input.equals("4")) {
                    if (a2 == ' ') {
                        a2 = '✔';
                        turn--;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else if (input.equals("5")) {
                    if (b2 == ' ') {
                        b2 = '✔';
                        turn--;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else if (input.equals("6")) {
                    if (c2 == ' ') {
                        c2 = '✔';
                        turn--;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else if (input.equals("7")) {
                    if (a3 == ' ') {
                        a3 = '✔';
                        turn--;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else if (input.equals("8")) {
                    if (b3 == ' ') {
                        b3 = '✔';
                        turn--;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else if (input.equals("9")) {
                    if (c3 == ' ') {
                        c3 = '✔';
                        turn--;
                        y++;
                    } else {
                        System.out.println("This is already picked");
                    }
                } else {
                    System.out.println("You have entered an invalid sapce"
                            + "please try again.");
                }
                System.out.printf(" %c | %c | %c \n", a1, b1, c1);
                System.out.printf("____________\n");
                System.out.printf(" %c | %c | %c \n", a2, b2, c2);
                System.out.printf("____________\n");
                System.out.printf(" %c | %c | %c \n", a3, b3, c3);
                if (a1 == '✔') {
                    if (a2 == '✔') {
                        if (a3 == '✔') {
                            System.out.println("Player 2 wins!!!");
                            System.exit(1);
                        }
                    }
                }
                if (b1 == '✔') {
                    if (b2 == '✔') {
                        if (b3 == '✔') {
                            System.out.println("Player 2 wins!!!");
                            System.exit(1);
                        }
                    }
                }
                if (c1 == '✔') {
                    if (c2 == '✔') {
                        if (c3 == '✔') {
                            System.out.println("Player 2 wins!!!");
                            System.exit(1);
                        }
                    }
                }
                if (a1 == '✔') {
                    if (b2 == '✔') {
                        if (c3 == '✔') {
                            System.out.println("Player 2 wins!!!");
                            System.exit(1);
                        }
                    }
                }
                if (a1 == '✔') {
                    if (b1 == '✔') {
                        if (c1 == '✔') {
                            System.out.println("Player 2 wins!!!");
                            System.exit(1);
                        }
                    }
                }
                if (a2 == '✔') {
                    if (b2 == '✔') {
                        if (c2 == '✔') {
                            System.out.println("Player 2 wins!!!");
                            System.exit(1);
                        }
                    }
                }
                if (a3 == '✔') {
                    if (b3 == '✔') {
                        if (c3 == '✔') {
                            System.out.println("Player 2 wins!!!");
                            System.exit(1);
                        }
                    }
                }
                if (c1 == '✔') {
                    if (b2 == '✔') {
                        if (a3 == '✔') {
                            System.out.println("Player 2 wins!!!");
                            System.exit(1);
                        }
                    }
                }

            }

        }

    }
}