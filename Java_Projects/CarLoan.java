public class CarLoan {
    public static void main(String[] args) {
        int carLoan = 10000;
        int loanLength = 3; // 3 years
        int interestRate = 5; // interest rate 5%
        int downPayment = 2000;

        if ((loanLength <= 0) || (interestRate <= 0)) {
            System.out.println("Error! You must take out a vlid car loan.");
        } else if (downPayment > carLoan) {
            System.out.println("The car can be paid in full");
        } else {
            int remainingBlanace = carLoan - downPayment;
        }
    }
}
