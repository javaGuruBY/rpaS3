public class RandomDemo {

    public static void main(String[] args) {

        int firstRandomNumber = (int) (Math.random()*4);
        int secondRandomNumber = (int) (Math.random()*4);
        int thirdRandomNumber = (int) (Math.random()*4);

        System.out.println("First number = " + firstRandomNumber + ", "
                + "Second number = " + secondRandomNumber + ", "
                + "Third number = " + thirdRandomNumber);

        int sumOfRandomNumbers = firstRandomNumber + secondRandomNumber + thirdRandomNumber;

        System.out.println("Sum of random numbers = " + sumOfRandomNumbers);

    }
}