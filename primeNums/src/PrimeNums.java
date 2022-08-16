public class PrimeNums {
    public static void main(String[] args) {


        for (int i = 2; i <= 100; i++){
            int temp = i / 2;
            boolean isPrime = true;
            for (int j = 2; j <= temp; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
            }
        }
    }
}
