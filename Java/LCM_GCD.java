class LCM_GCD {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
       
        int gcd = findGCD(num1, num2);
        System.out.println(gcd);
        System.out.println(findLCM(num1, num2, gcd));
        gcd(num1, num2);
        lcm(num1, num2);
    }

    private static int findGCD(int num1, int num2){
        if(num2 == 0) {
            return num1;
        }
        else{
            return findGCD(num2, num1%num2);
        }
    }

    private static int findLCM(int num1, int num2, int gcd){
        return Math.abs(num1 * num2)/gcd;
    }
    
    private static void gcd(int a, int b) {
        int hcf = 0;
        for (int i=1; i<=a || i<=b; i++){
            if(a%i == 0 && b%i == 0){
                hcf = i;
            }
        }
        System.out.println("GCD: "+ hcf);
    }

    private static void lcm(int a, int b) {
        int max, step, lcm = 0;
        
        if(a>b) {
            max = step = a;
        } else {
            max = step = b;
        }
        while(a != 0){
        if(max%a == 0 && max%b == 0) {
            lcm = max;
            break;
         }
         max += step;
      }
      System.out.println("LCM: " +lcm);
    }
}