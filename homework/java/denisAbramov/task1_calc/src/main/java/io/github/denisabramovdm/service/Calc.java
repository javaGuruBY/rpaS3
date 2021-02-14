package io.github.denisabramovdm.service;
import io.github.denisabramovdm.bean.Inputs;

import java.util.Scanner;

public class Calc {


    //  Inputs inputs = new Inputs();

    public Calc(Inputs inputs) {

    }


    public void calculating(@org.jetbrains.annotations.NotNull Inputs inputs){
    switch (inputs.getOperation()) {
        case "+": {inputs.setResult(inputs.getNumber1() + inputs.getNumber2());
        break;}

        case "-": {inputs.setResult(inputs.getNumber1() - inputs.getNumber2());
        break;}

        case "*": {inputs.setResult(inputs.getNumber1() * inputs.getNumber2());
        break;}
        case "/": {inputs.setResult(inputs.getNumber1() / inputs.getNumber2());
        break;}
    }
    System.out.println(inputs.getResult());
}

    public void inputing(@org.jetbrains.annotations.NotNull Inputs inputs){
        System.out.println("Введите первое число");
        Scanner in = new Scanner(System.in);
        inputs.setNumber1(in.nextDouble());

        System.out.println("Введите операцию: +, -, * или /");
        inputs.setOperation(in.next());

        System.out.println("Введите второе число");
        inputs.setNumber2(in.nextDouble());
        in.close();

    }

}


