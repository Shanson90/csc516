package homework;

import java.io.*;

public class SearchBenchmarks
{
   public static int binaryComparisons = 0;
   public static int sequentialComparisons = 0;

   public static void main(String [] args) throws IOException
   {
      int binaryResult, searchValue, sequentialResult;
      String input;
      
      // An array of numbers to search.
      int numbers[] = { 536, 289, 296, 429, 319, 142, 394,
                        101, 388, 147, 417, 199, 207, 222,
                        189, 310, 447, 521, 234, 600};
      
      // Create the console input objects.
      InputStreamReader reader = new InputStreamReader(System.in);
      BufferedReader keyboard = new BufferedReader(reader);

      // First we must sort the array in ascending order.
      IntQuickSorter.quickSort(numbers);
      for(int i = 0; i < numbers.length; i++){
          System.out.println(numbers[i]);
      }


      do
      {
         // Get a value to search for.
         System.out.print("Enter a value to search for: ");
         input = keyboard.readLine();
         searchValue = Integer.parseInt(input);

         // Search for the value
         binaryResult = RecursiveBinarySearcher.search(numbers, searchValue);
         sequentialResult = IntSequentialSearcher.search(numbers, searchValue);

        // Display the results.
        if (binaryResult == -1)
           System.out.println(searchValue + " was not found in Binary Search.");
        else if (sequentialResult == -1){
            System.out.println(searchValue + " was not found in Sequential Search.");
        }
        else
        {
           System.out.println(searchValue + " was found at element " + binaryResult + " in Binary Search after "  + binaryComparisons + " comparisons");
           System.out.println(searchValue + " was found at element " + binaryResult + " in Sequential Search after "  + sequentialComparisons + " comparisons");
           binaryComparisons = 0;
           sequentialComparisons = 0;
        }

        // Does the user want to search again?
        System.out.print("Do you want to search again? (Y or N): ");
        input = keyboard.readLine();
      } while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
   }
}
