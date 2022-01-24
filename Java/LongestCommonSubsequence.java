public class LongestCommonSubsequence {

    // Naive Approach for Longest Common Subsequence
    int naive_lcs(char[] X, char[] Y, int m, int n){
        if (m == 0 || n == 0) return 0;

        if( X[m-1] == Y[n-1]){
            return 1 + naive_lcs(X, Y, m-1, n-1);
        } 
        else {
            return max(naive_lcs(X, Y, m, n-1), naive_lcs(X, Y, m-1, n));
        }
    }



    // Dynamic Programing Approach
    int dynamic_lcs(char[] X, char[] Y, int m, int n){
        int D[][] = new int[m+1][n+1];

        for (int i = 0; i<= m; i++){
            for (int j = 0; j <= n; j++){
                if (i == 0 || j == 0){
                     D[i][j] = 0;
                }
                else if (X[i-1] == Y[j-1]){
                    D[i][j] = D[i-1][j-1] + 1; 
                }
                else {
                    D[i][j] = max(D[i][j-1], D[i-1][j]);
                    }
            }
        }

        return D[m][n];
    }

    int max(int a, int b){
        return (a>b)? a : b;
    }

  public static void main(String[] args) {
      LongestCommonSubsequence lcs = new LongestCommonSubsequence();
      String x = "NIKHILAHLAWAT";
      String y = "HIMANIDIMRI";

      char[] X = x.toCharArray();
      char[] Y = y.toCharArray();
      
      System.out.println("Naive Approach: "+lcs.naive_lcs(X, Y, X.length, Y.length));
      System.out.println("Dynamic Approach: "+lcs.dynamic_lcs(X, Y, X.length, Y.length));
    }
    
}
