package www.ybm.it.dos.exam1;
// You may use import as below.
import java.util.*;

class Solution02 {
    public int solution(int price, String grade) {
        // Write code here.
        int answer = 0;
        return answer;
    }    

    // The following is main method to output testcase.
    public static void main(String[] args) {
    	Solution02 sol = new Solution02();
        int price1 = 2500;
        String grade1 = new String("V");
        int ret1 = sol.solution(price1, grade1);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int price2 = 96900;
        String grade2 = new String("S");
        int ret2 = sol.solution(price2, grade2);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}