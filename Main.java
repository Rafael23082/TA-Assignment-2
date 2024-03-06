import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int[] list = new int[5];

        list[0] = 1;
        list[1] = 3;
        list[2] = 4;
        list[3] = 6;
        list[4] = 8;

        System.out.println("Input: numbers = " + Arrays.toString(list));

        System.out.print("Enter target: ");
        int target = scn.nextInt();

        boolean results_found = false;

        for (int i = 0; i < 5; i++) {
            for (int u = 0; u < 5; u++) {
                if (list[i] + list[u] == target) {
                    if (list[i] != list[u]) {
                        while (results_found == false) {
                            System.out.println("Output: " + "[" + (i+1) + ", " + (u+1) + "]");
                            System.out.println("Explanation: The sum of " + list[i] + " and " + list[u] + " is " + target + ". Therefore, index1 = " + (i+1) + " , index2 = " + (u+1) + ". We return " + "[" + (i+1) + ", " + (u+1) + "]");
                            results_found = true;
                        }
                    }
                }
            }
        }
        if (results_found == false){
            System.out.println("No Solution Available");
        }
    }
}