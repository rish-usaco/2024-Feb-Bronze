import java.util.*;

public class oneington {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            char W = 'B';
            String N = scan.next();
            if (N.charAt(N.length()-1) == '0') {
                W = 'E';
            }
            System.out.println(W);
        }
        
        
        
        
    }    
}
