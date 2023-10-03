/* Simple Pattern like               a b c d e
 *                                   a b c d e
 *                                   a b c d e
 *                                   a b c d e 
 */



public class Pattern9 {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=5;j++){
                char name = (char) ('a' + j-1);
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }
}
