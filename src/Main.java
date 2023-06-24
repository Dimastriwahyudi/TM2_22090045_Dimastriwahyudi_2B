
import java.util.ArrayList;
import java.util.List;

    public class Main {
        public static List<Integer> fibonacciGenap(int n) {
            List<Integer> sequence = new ArrayList<>();
            int a = 0, b = 1;
            while (b <= n) {
                if (b % 2 == 0) {
                    sequence.add(b);
                }
                int temp = a + b;
                a = b;
                b = temp;
            }
            return sequence;
        }



            public static void main(String[] args) {
                List<Integer> deretFibonacciGenap = fibonacciGenap(4500);
                int totalBilanganGenap = deretFibonacciGenap.size();
                int jumlahBilanganGenap = 0;

                System.out.println("Deretan bilangan Fibonacci genap dari 10 sampai 4500 :");
                for (int num : deretFibonacciGenap) {
                    System.out.print(num + " ");
                    jumlahBilanganGenap += num;
                }

                System.out.println("\nJumlah bilangan Fibonacci genap: " + jumlahBilanganGenap);
                System.out.println("Total bilangan Fibonacci genap: " + totalBilanganGenap);
            }


        }






