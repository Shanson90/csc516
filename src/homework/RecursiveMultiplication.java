package homework;

public class RecursiveMultiplication
{
    // Write a recursive function that accepts two arguments
    // into the parameters x and y. The function should return
    // the value of x times y. Remember, multiplication can be
    // performed as repeated addition as follows:
    //    7 * 4 = 4+4+4+4+4+4+4


    public static int multiply(int x, int y){
        if(x == 0 || y == 0){
            return 0;
        }

        if(x == 1){
            return y;
        }

        if(y == 1){
            return x;
        }

        int sum = y;
        x--;

        if(x > 0){
            sum += multiply(x, y);
        }

        return sum;
    }
}