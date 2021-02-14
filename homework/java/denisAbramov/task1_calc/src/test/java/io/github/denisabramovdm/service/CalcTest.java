package io.github.denisabramovdm.service;

import io.github.denisabramovdm.bean.Inputs;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class CalcTest {
    Inputs user_inputs = new Inputs();
    Calc calcal = new Calc(user_inputs);
    @Before
    public void setUp(){
        user_inputs.setNumber2(5);
        user_inputs.setNumber1(20);
        user_inputs.setOperation("*");
    }






    @Test
    public void calc_test() {
       calcal.calculating(user_inputs);
        Assert.assertEquals(100.0, user_inputs.getResult(), 5);


   }

}