package www.ybm.it.dos.exam1;
class Solution09 {
    public String solution(String characters){
    	 String result = "";
         result += characters.charAt(0);
         for (int i = 0; i < characters.length(); i++) {
             if (characters.charAt(i - 1) != characters.charAt(i))
                 result += characters.charAt(i);
         }
         return result;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Solution09 sol = new Solution09();
        String characters = "senteeeencccccceeee";
        String ret = sol.solution(characters);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}