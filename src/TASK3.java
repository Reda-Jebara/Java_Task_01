public class TASK3 {
    public static void main(String[] args) {

                 ////------TASK03-----////

        int randomValue = (int) (Math.random() * (100 - 1));

        if (randomValue % 2 == 0) {
            System.out.println(randomValue + " it's an even number");
        }
        else {
            System.out.println(randomValue + " it's an odd number");
        }
    }
}