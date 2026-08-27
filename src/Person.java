public class Person {

    String name;
    int age;
    String color;

    Person(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void displayInfo(){
        System.out.println("You are " + name + " of age " + age + " and your fav color is " + color);
    }


    }

