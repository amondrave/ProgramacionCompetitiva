
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
        byte vec1[] = new byte[5];
        byte vec2[] = new byte[5];
        while (sc.hasNext()) {
            for (byte i = 0; i < 5; i++) {
                vec1[i] = sc.nextByte();
            }
            for (byte j = 0; j < 5; j++) {
                vec2[j] = sc.nextByte();
            }
            boolean r = false;

            for (byte k = 0; k < 5; k++) {
                if (vec1[k] == vec2[k]) {
                    r = true;
                    break;

                }
            }

            if (r == true) {
                System.out.println("N");
            } else {
                System.out.println("Y");
            }

        }

    }
}
