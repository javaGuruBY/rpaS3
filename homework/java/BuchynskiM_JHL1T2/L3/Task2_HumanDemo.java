package Lecture3_Task2;

public class HumanDemo {
    public static void main(String[] args) {
        Human human = new Human("Max",31);

        human.greet();
    }

    public static class Human{

        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void greet(){
            System.out.println("Hi, my name is "+name+", I'm "+age+" years old");
        }
    }
}
