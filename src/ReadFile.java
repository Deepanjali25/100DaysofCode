import java.util.*;
import java.io.File;
import java.io.IOException;
public class ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("/C:/Users/User/Downloads/dataset_91065.txt"));
        fileReader(file);
    }
    static void fileReader(Scanner file) {
        int count = 0;
        while (file.hasNextLine()) {
            int nextInt = file.nextInt();
            System.out.println(nextInt);
            if (nextInt%2==0 && nextInt!=0) {
                count++;
            }
            else if (nextInt==0) {
                break;
            }
        }
        System.out.println(count);
    }
}