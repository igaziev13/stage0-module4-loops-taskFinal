package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int i, result = 1;
        for (i=1;i<=power;i++)
            result = result * numberToPrint;
        System.out.println(result);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
