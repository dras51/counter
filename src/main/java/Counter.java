public class Counter {
    //Recursion: the process of a function/method calling itself.

    //Create a method that counts up from a start number to a finish number.
    void countTo(int start, int stop) {
        //Check if start value is greater than final value, then return an error if so.
        if (start > stop) {
            System.out.println("Start value must be less than final value. Please try again!!");
            return;
        }
        //Print the value of start to the console //stop is 10
        System.out.println(start); //2

        //add one to the value of start
        start++; //start 3

        if (start <= stop){
            countTo(start, stop);
        }

        return;

    }

    //Create a method that counts down from a start number to a finish number


}
