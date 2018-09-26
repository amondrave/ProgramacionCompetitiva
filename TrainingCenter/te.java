import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num=sc.nextInt();
        int nn=0;
            for (int j = 0; j < 5; j++) {
            if (sc.nextInt() == num) {
                nn ++;
            }
        }

        System.out.println(nn);

    }

}
}
