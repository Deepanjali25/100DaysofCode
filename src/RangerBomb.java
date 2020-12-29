import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RangerBomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while(testCases-->0) {
            int maxJump = scanner.nextInt();
            int stairCases = scanner.nextInt();
            List<Integer> bomb = new ArrayList<>();
            while (scanner.hasNextLine()){
                int i = 0;
                bomb.set(i, scanner.nextInt());
                i++;
            }
            for (int i = 0; i < bomb.size(); i+=maxJump) {

            }
        }
    }
}
