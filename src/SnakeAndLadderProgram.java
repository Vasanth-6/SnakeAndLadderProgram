public class SnakeAndLadderProgram {
        int startingPosition=0;
        public static final int isNoPlay = 0;
        public static final int isSnake = 1;
        public static final int isLadder = 2;

        int playerInitPosition=0;
        int newPosition=0;
        int optionNumber;
        int diceNumber;

        public void showPosition(){
            System.out.println("Welcome to SNAKE AND LADDER PROGRAM");
            System.out.println("Starting position of the player = " + startingPosition);
            System.out.println("Starting position of the player = " + playerInitPosition);

        }

    public int rollingDice()
    {
        int diceNumber = (int) Math.floor(Math.random()*10)%6+1;
        return diceNumber;
    }
    public void optionPlay(int diceNumber)
    {
        int optionNumber= (int) Math.floor(Math.random()*10)%3+1;
        System.out.println("Option Number : " + optionNumber);

        switch (optionNumber)
        {
            case isNoPlay:
                System.out.println("You Got No Play");
                newPosition = 0;
                break;

            case isLadder:
                System.out.println("You Got Ladder");
                playerInitPosition = playerInitPosition + diceNumber;
                if (playerInitPosition > 100) {
                    System.out.println("There is no such position");
                    playerInitPosition = --diceNumber;
                }
                break;

            case isSnake:
                System.out.println("You got snake");
                playerInitPosition = playerInitPosition - diceNumber;
                if(playerInitPosition < 0)
                {
                    playerInitPosition = 0;
                }
                break;

        }
    }
        public static void main(String[] args) {
            SnakeAndLadderProgram P1 = new SnakeAndLadderProgram();

            P1.showPosition();
            System.out.println("Input from user by rolling dice : " + P1.rollingDice());
            P1.optionPlay(P1.rollingDice());
            P1.showPosition();
            P1.optionPlay(P1.rollingDice());
            P1.showPosition();P1.optionPlay(P1.rollingDice());
            P1.showPosition();
            P1.optionPlay(P1.rollingDice());
            P1.showPosition();
        }
    }
