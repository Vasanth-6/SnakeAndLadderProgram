public class SnakeAndLadderProgram {
        int startingPosition=0;

        public void showPosition(){
            System.out.println("Welcome to SNAKE AND LADDER PROGRAM");
            System.out.println("Starting position of the player = " + startingPosition);

        }

    public int rollingDice()
    {
        int diceNumber = (int) Math.floor(Math.random()*10)%6+1;
        return diceNumber;
    }

        public static void main(String[] args) {
            SnakeAndLadderProgram P1 = new SnakeAndLadderProgram();

            P1.showPosition();
            System.out.println("Input from user by rolling dice : " + P1.rollingDice());
        }
    }
