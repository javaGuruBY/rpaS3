package com.javacourse.se;

import Objects.*;

public class Main {
    public static void main(String[] args){
        Car ourCar;
        ourCar = new Car();
        
        TV_set ourTV_set;
        ourTV_set = new TV_set();
        
        Vape ourVape;
        ourVape = new Vape();
        
        Chair ourChair;
        ourChair = new Chair();
        
        Shoe ourShoe;
        ourShoe = new Shoe();
        
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

        ourCar.color = "Grey";
        ourCar.horsePower = "170hp";
        ourCar.model = "BMW3-серии";
        
        ourTV_set.channel = "49d";
        ourTV_set.color = "Black";
        ourTV_set.model = "Sony";
        
        ourVape.color = "Purple";
        ourVape.model = "Smoant";
        ourVape.taste = "AppleJuice";
        
        ourChair.color = "Blue";
        ourChair.model = "UltraChair2000";
        ourChair.material = "Leather";
        
        ourShoe.model = "Nike";
        ourShoe.season = "Summer";
        ourShoe.size = "43";
        
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

        ourCar.showColor();
        ourCar.showModel();
        ourCar.showHorsePower();

        ourTV_set.showChannels();
        ourTV_set.showModel();
        ourTV_set.showCcolor();

        ourVape.showColor();
        ourVape.showModel();
        ourVape.showTaste();

        ourChair.showColor();
        ourChair.showModel();
        ourChair.showMaterial();

        ourShoe.showModel();
        ourShoe.showSize();
        ourShoe.showSeason();
        
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
