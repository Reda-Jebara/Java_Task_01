public class main {
    public static void main(String[] args) {

                  ////// TASK2: This program calculates how much would be your weight on Mars
        float earthWeightReda=58;
        float marsWeightReda;
        double marsWeightInDouble;
        int marsWeightInInt = 0;


        marsWeightReda=(earthWeightReda*0.38F);
        System.out.println(earthWeightReda+"kg on Earth is "+ marsWeightReda + "kg on Mars");

        marsWeightInDouble=marsWeightReda;

        System.out.println("Kilograms on Mars after converting to double: "+ marsWeightInDouble);

        System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f %n",marsWeightInDouble);

        marsWeightInInt =(int) marsWeightInDouble;

        System.out.println("Kilograms on Mars when casted to Integer "+ marsWeightReda);

        char c= (char)marsWeightInInt;

        System.out.println("The ASCII table equivalent of marsWeightInInt is :" + c);

        int exampleOfMathOnChar= c*c;

        System.out.println("An example of math operation on the char type: "+ exampleOfMathOnChar);
    }

}
