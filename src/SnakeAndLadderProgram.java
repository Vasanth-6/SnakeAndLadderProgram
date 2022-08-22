import java.util.Random;

public class SnakeAndLadderProgram {


        int startingPosition = 0;
        public static final int isNoPlay = 0;
        public static final int isSnake = 1;
        public static final int isLadder = 2;

        int playerInitPosition = 0;
        int newPosition = 0;
        int rollingCount = 0;
        int optionNumber;
        int diceNumber;

        Random randomNumber = new Random();
    public int showPosition() {

            int diceNumber = randomNumber.nextInt(6) + 1;
            rollingCount++;
            System.out.println("Dice Count : " + rollingCount);
            return diceNumber;
        }

        public static void main(String args[]) {
            Random randomNumber = new Random();
        }

    }
