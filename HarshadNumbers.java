class HarshadNumbers{
    public static void main(String[] args) {
        System.out.println("Harshad Numbers between 500 & 2500 are:");
        for (int num = 500; num <= 2500; num++) {
            int n = num;
            int sum = 0;
            while (n > 0) {
                sum += n % 10; 
                n /= 10; 
            }
            if (num % sum == 0) {
                System.out.println(num);
            }
        }
    }
}