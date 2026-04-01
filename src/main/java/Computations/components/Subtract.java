package Computations.components;

import Computations.Interface.Compute;

public class Subtract implements Compute {

    int num1, num2;

    public Subtract(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public int doMath() {
        return num2 > num1 ? num2 - num1 : num1 - num2;
    }
}
