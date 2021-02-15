package com.javacourse.se.lecture1;


import com.javacourse.se.object.*;

public class Main {
    public static void main(String[] args) {
        Telephone ourTelephone;
        ourTelephone = new Telephone();
        
        Table ourTable;
        ourTable = new Table();
        
        Bracelet ourBracelet;
        ourBracelet = new Bracelet();
        
        Flower ourFlower;
        ourFlower = new Flower();
        
        Cake ourCake;
        ourCake = new Cake ();

        ourTelephone.model = "iphone";
        ourTelephone.color = "black";
        
        ourTable.material = "wooden";
        ourTable.age = "five old";
        
        ourBracelet.sex = "women";
        ourBracelet.size = "silver";
        
        ourFlower.name = "Rose";
        ourFlower.state = "alive";
        
        ourCake.form = "round";
        ourCake.taste = "sweet";



        ourTelephone.showModel();
        ourTelephone.showColor();
        
        ourTable.showAge();
        ourTable.showMaterial();
        
        ourBracelet.showSex();
        ourBracelet.showSize();
        
        ourFlower.showName();
        ourFlower.showState();
        
        ourCake.showForm();
        ourCake.showTaste();




    }
}
