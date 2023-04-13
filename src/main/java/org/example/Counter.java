package org.example;

import java.util.Scanner;

public abstract class Counter implements AutoCloseable {
    private int in;

    public Counter(int in) {
        this.in = in;
    }

    public int getIn() {
        return in;
    }

    public void setIn(int in) {
        this.in = in;
    }

    public void correct() {
        Scanner in = new Scanner (System.in);
        System.out.print( "Input Name pride and commands");
        String correct = in.nextLine();
        {
            if (correct instanceof String){
                System.out.println ("Your name is correctly entered");
            }
            else {
                throw new illegalStateException("Data is a not coorectly");
            }
        }

    }


}
