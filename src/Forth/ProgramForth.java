package Forth;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ProgramForth {

    public static void main(String[] args) {

        FileReader fr = null;

        File f = new File("ddsssad");
        try {
            fr = new FileReader(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            simpleWaiter(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            int i = 10/0;

        } catch (ArithmeticException iae){
            System.out.println("Exception toString(): " + iae);
            System.out.println("Exception getMessage(): " + iae.getMessage());
            System.out.println("");
            System.out.println("Exception printStackTrace(): ");
            iae.printStackTrace();
        } finally {
            System.out.println("Final block.");
        }


    }

private static void simpleWaiter(long timeout) throws InterruptedException {
    Thread.sleep (timeout);
}

}
