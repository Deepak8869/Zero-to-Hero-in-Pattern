package MediumLevelPattern;

/* Pattern Like               a
 *                            b b 
 *                            c c c
 *                            d d d d
 *                            e e e e e
 */


public class Pattern5 {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            char name =  (char)('a' + i -1);
            for(int j = 1;j<=i;j++){
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }
}
