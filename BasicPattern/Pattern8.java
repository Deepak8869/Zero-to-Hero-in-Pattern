/* Simple Pattern Like         a a a a a
 *                             b b b b b
 *                             c c c c c
 *                             d d d d d
 */


public class Pattern8 {
    public static void main(String[] args) {
       
        for(int i = 1;i<=5;i++){
             char name = (char) ('a' + i-1);
            for(int j = 1;j<=5 ;j++){
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }
}
