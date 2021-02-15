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
}
}
