package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortBenchmarks {
    public static int bubbleSwaps = 0;
    public static int insertionSwaps = 0;
    public static int quickSwaps = 0;
    public static int selectionSwaps = 0;


    public static void main(String[] args) throws IOException {
        int searchValue;
        String input;

        // Arrays of numbers to search.


        // Create the console input objects.
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(reader);

        do {
            int[] numbers1 = {536, 289, 296, 429, 319, 142, 394,
                    101, 388, 147, 417, 199, 207, 222,
                    189, 310, 447, 521, 234, 600};

            int[] numbers2 = {536, 289, 296, 429, 319, 142, 394,
                    101, 388, 147, 417, 199, 207, 222,
                    189, 310, 447, 521, 234, 600};

            int[] numbers3 = {536, 289, 296, 429, 319, 142, 394,
                    101, 388, 147, 417, 199, 207, 222,
                    189, 310, 447, 521, 234, 600};

            int[] numbers4 = {536, 289, 296, 429, 319, 142, 394,
                    101, 388, 147, 417, 199, 207, 222,
                    189, 310, 447, 521, 234, 600};

            IntBubbleSorter.bubbleSort(numbers1);
            IntInsertionSorter.insertionSort(numbers2);
            IntQuickSorter.quickSort(numbers3);
            IntSelectionSorter.selectionSort(numbers4);

            System.out.println("\nBubble sort made " + bubbleSwaps + " swaps.");
            System.out.println("Insertion sort made " + insertionSwaps + " swaps.");
            System.out.println("Quick sort made " + quickSwaps + " swaps.");
            System.out.println("Selection sort made " + selectionSwaps + " swaps.");

            bubbleSwaps = 0;
            insertionSwaps = 0;
            quickSwaps = 0;
            selectionSwaps = 0;

            // Does the user want to run benchmarks again?
            System.out.print("Do you want to run benchmarks again? (Y or N): ");
            input = keyboard.readLine();
        } while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
    }
}
