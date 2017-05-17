import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by flux on 5/16/2017.
 */
public class Algorithms {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Which algorithm do you want to run?");
        System.out.println("[1] A* \n[2] Prim Minimum Spanning Tree \n[3] Fast Fourier \n[4] Karatsuba Multiplication \n" +
                           "[5] Knapsack Problem \n[6] Merge Sort \n[7] Fibonacci");

        System.out.print("\nEnter Number:");
        String s = br.readLine();
        int i = 0;
        try{
            i = Integer.parseInt(s);
            br.close();
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
            br.close();
        }
        if (i < 1 || i > 7){
            System.out.println("Invalid Input");
            return;
        }

        switch(i){
            case 1 :
                new AStar();
                break;
            case 2 :
                new FastFourier();
                break;
            case 3 :
                new Fibonacci();
                break;
            case 4 :
                new Karatsuba();
                break;
            case 5 :
                new Knapsack();
                break;
            case 6 :
                new MergeSort();
                break;
            case 7 :
                new Prim();
                break;
            default :
                System.out.println("Value not found, Exiting...");
                break;
        }

    }

}
