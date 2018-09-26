
import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int vec1[] = new int[4];
        while (sc.hasNext()) {
            for (byte i = 0; i < 4; i++) {
                vec1[i] = sc.nextInt();
            }
            int j=vec1[1]+vec1[2];
            int k=vec1[0]+vec1[3];
            System.out.println(Math.abs(k-j));

        }

    }
}
