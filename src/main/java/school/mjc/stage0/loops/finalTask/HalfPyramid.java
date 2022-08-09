package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for(int x=1;x<=cathetusLength;x++) {

            for (int z = x; z < cathetusLength; z++)
                System.out.print(" ");

            for (int z = 1; z <= x; z++)
                System.out.print("*");

            System.out.println();
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
