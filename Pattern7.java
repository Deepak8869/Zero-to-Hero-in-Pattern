/*Simple Pattern Like    1 4 9 16 25
 *                       1 4 9 16 25
 *                       1 4 9 16 25
 *                       1 4 9 16 25
 */


public class Pattern7 {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=5;j++){
                System.out.print(j*j + " ");
            }
            System.out.println();
        }
    }
}
