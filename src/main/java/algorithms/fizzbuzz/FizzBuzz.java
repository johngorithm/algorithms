package algorithms.fizzbuzz;

public class FizzBuzz {

    public static String checkFizzBuzz(int num) {
        if (num < 1) {
            return "Invalid Input";
        }
        if (num % 5 == 0 && num % 3 == 0) {
            return "FizzBuzz";
        } else if (num % 5 == 0){
            return "Buzz";
        } else if (num % 3 == 0){
            return "Fizz";
        }
        return String.valueOf(num);
    }

    public static void fizzBuzz(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(checkFizzBuzz(i));
        }
    }
}
