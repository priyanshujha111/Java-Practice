public class EvenFibonacci {
    

        public static int sumEvenFibonacci(int n) {
            int a=0;
            int b= 1;
            int sum=0;
            while(a<=n){
                if(a %2 == 0){
                    sum+=a;

                }
                int next = a+b;
                a=b;
                b= next;


            }
            return sum;

        }
        public static void main(String[] args) {
            int n=10;
            int result= sumEvenFibonacci(n);

            System.err.println("Sum of evenFibonacci up to"+n+"is"+result);
        }
    }
    