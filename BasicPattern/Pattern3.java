/* Simple printing the pattern like 10 10 10 10 10
 *                                  10 10 10 10 10
 *                                  10 10 10 10 10
 *                                  10 10 10 10 10
 */


public class Pattern3 {
    public static void main(String[] args) {
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                System.out.print("10" + " ");
            }

            System.out.println();
        }
    }
}
