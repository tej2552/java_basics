package Computations.components;

import Computations.Interface.Compute;

public class Add implements Compute {

    int num1, num2;

    public Add(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public int doMath() {
        return num1 + num2;
    }
}
