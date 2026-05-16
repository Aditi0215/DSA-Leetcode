class Solution {
    public static boolean isPrime(int n) 
    {
        if (n <= 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public int sumOfPrimesInRange(int n) {

        int original = n;
        int rev = 0;
        int sum = 0;

        while (n != 0) 
        {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        int start = Math.min(original, rev);
        int end = Math.max(original, rev);

        for (int i = start; i <= end; i++) 
        {
            if (isPrime(i)) 
            {  
                sum += i;
            }
        }

        return sum;
    }
}
