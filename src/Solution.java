import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int line = 0;
        while(scan.hasNext()){
            line++;
            String s = scan.nextLine();
            System.out.printf("%d %s %n", line, s);
        }
        scan.close();
    }
}