import java.util.*;

public class twooooooo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        long M = scan.nextInt();
        String dirs = scan.next();
        long[] max = new long[N];
        long[] fill = new long[N];
        for (int i = 0; i < N; i++) {
            max[i] = scan.nextInt();
            fill[i] = max[i];
        } 
        
        for (long t = 0; t < Math.min(M, N); t++) {
            
            for (int i = 0; i < N; i++) {
                int change = 0;
                if (fill[i] != 0) {
                    change = 1;
                }
                
                if (dirs.charAt(i) == 'R') {
                    fill[i] -= change;
                    fill[(i+1)%N] += change;
                } else {
                    fill[i] -= change;
                    fill[(i+N-1)%N] += change;
                }
            } 
            for (int i = 0; i < N; i++) {
                //System.out.print(fill[i] + " ");
                fill[i] = Math.min(max[i], fill[i]);
            }//System.out.println();
            
        }
        
        long count = 0;
        for (int i = 0; i < N; i++) {
                count+= fill[i];
        }
        
        System.out.println(count);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
