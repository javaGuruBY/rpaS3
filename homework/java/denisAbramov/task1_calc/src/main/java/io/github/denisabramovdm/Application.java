package io.github.denisabramovdm;

import io.github.denisabramovdm.bean.Inputs;
import io.github.denisabramovdm.service.Calc;

public class Application {

    public static void main(String[] args) {
        Inputs inputs = new Inputs();
        Calc calc = new Calc(inputs);

        calc.inputing(inputs);
        calc.calculating(inputs);


    }

}
