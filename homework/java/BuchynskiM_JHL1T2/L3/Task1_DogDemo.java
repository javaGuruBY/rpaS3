package Lecture3_Task1;


public class DogDemo {
    public static void main(String[] args) {

        Dog dog = new Dog(1, "white", "Bobik");

        dog.voice();
        dog.eat();
        dog.sleep();

    }

    static class Dog{
        private int age;
        private String color;
        private String name;

        public Dog(int age, String color, String name) {
            this.age = age;
            this.color = color;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void voice(){
            System.out.println(name +" is barking");
        }

        public void eat(){
            System.out.println("My name is " + name + ". I'm " + age + " year old and i'm eating.");
        }

        public void sleep() {
            System.out.println("My color is "+ color +" and I'm going to sleep");
        }
    }
}
