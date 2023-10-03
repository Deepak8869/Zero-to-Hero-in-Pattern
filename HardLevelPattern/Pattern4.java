package HardLevelPattern;
/* Pattern Like       A
 *                  A B
 *                A B C
 *              A B C D
 */
public class Pattern4 {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=5-i;j++){
                System.out.print("  ");
            }
            char name = (char)('A' + i-1);
            for(char k = 'A';k<=name;k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
