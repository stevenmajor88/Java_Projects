public class FizzBuzz {
    public static void main(String[] args) {
        // numbers 1 to 100
        // multiple of 3: Fizz
        // multiple of 5: Buzz
        // multiple of 3 and 5: FizzBuzz
        // otherwise print number itself
        for (int i = 0; i <= 100; i++) {

            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }

        }

    }
}
