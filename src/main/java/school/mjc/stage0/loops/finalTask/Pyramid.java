package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for(int x=1;x<=cathetusLength;x++) {
            //Space input
            for (int z = x; z < cathetusLength; z++)
                System.out.print(" ");
            //Reversed itteration
            for (int z = 1; z <= x; z++)
                    System.out.print(x-z+1);
            //Normal itteration
                for (int z = 2; z <= x; z++)
                    System.out.print(z);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(8);
    }
}
