import java.util.Random;
public class RockPaperScissors {

    public static void main(String[] args) {
        Random rand = new Random();
        int randnum = rand.nextInt(3);
        System.out.println(randnum);
        if (randnum == 0) {
            System.out.println("rock");
        }
        if (randnum == 1) {
            System.out.println("paper");
        } else {
            System.out.println("scissors");
        }
    }
}