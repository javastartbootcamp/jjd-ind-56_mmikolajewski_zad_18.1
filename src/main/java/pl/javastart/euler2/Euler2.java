package pl.javastart.euler2;

public class Euler2 {
    public static void main(String[] args) {
        Euler2 euler2 = new Euler2();
        int sum = euler2.countFibonacci(4000000);
        System.out.println("\nsuma elementów parzystych " + sum);
    }

    public int countFibonacci(int limit) {
        int firstTerm = 0;
        int secondsTerm = 1;
        int sum = 0;

        while (firstTerm <= limit) {
            if (firstTerm % 2 == 0) {
                sum += firstTerm;
            }
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondsTerm;
            firstTerm = secondsTerm;
            secondsTerm = nextTerm;
        }
        return sum;
    }
}
