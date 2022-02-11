class ArmstrongNumber{
    public static void main(String[] args) {
        int num = 153;
        System.out.println(checkArmstrong(num));
        System.out.println(reverseNumber(num));
    }


    private static boolean checkArmstrong(int num) {
        int temp = num;
        int result = 0;

        while (temp > 0){
            int remainder = temp % 10;
            result += Math.pow(remainder, 3);
            temp /= 10;
        }

        if(result == num)
            return true;
        return false;
    }

    private static int reverseNumber (int num){
        int reverse = 0;
        while (num > 0){
           int remainder = num%10;
           reverse = reverse * 10 + remainder;
           num /= 10;
       }
        return reverse;
    }
}