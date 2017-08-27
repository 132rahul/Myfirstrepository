import java.util.*;

public class Hakerrank {

    static Scanner scanner;

    public static void main(String args[]) throws Exception {


        scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T > 0) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            findingMinimumSumSubarray(array, K);

            T--;
        }


    }

    public  static void findingMinimumSumSubarray(int arr[],int k)
    {
        int N = arr.length;
        int ans = arr[0]; // initializing with any possible sums
        for (int L = 0; L < N; L++) {
            for (int R = L; R < N; R++) {
                List<Integer> A=new ArrayList<>();
                List<Integer> B=new ArrayList<>(); // our "inner" and "outer" sets
                int suma = 0; // will store initial sum of elements in A
                for (int i = 0; i < N; i++) {
                    if (i >= L && i <= R) {
                        A.add(arr[i]);
                        suma += arr[i];
                    } else {
                        B.add(arr[i]);
                    }
                }
                // Sorting set A in ascending order
                Collections.sort(A);

                // Sorting set B in descending order
                Collections.sort(B,Collections.reverseOrder());

                ans = Math.min(ans, suma); // Updating answer with initial state
                // Iterating number of swaps that we will make
                for (int t = 1; t <= k; t++) {
                    // if some of two sets contain less than t elements
                    // then we cannot provide this number of swaps
                    if (t > A.size() || t > B.size()) break;
                    // Swapping t-th maximum of A with t-th minimum of B
                    // It means that t-th maximum of A subtracts from suma
                    // and t-th minimum of B added to suma
                    suma -= (int) A.get(A.size() - t);
                    suma += (int) B.get(B.size() - t);
                    ans = Math.min(ans, suma);
                }
            }
        }
    System.out.println(ans);
    }
}