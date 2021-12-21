package people;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int money;
    private int age;

    public Person(String name, int money, int age){
        this.age = age;
        this.money = money;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void happyBirthday(){
        age++;
    }

    public String getName(){
        return name;
    }

    public int getMoney(){
        return money;
    }

    public void changeMoney(int x){
        money += x;
    }

    public void setName(String newName){
        name = newName;
    }

    public String toString(){
        return "Человек" + name;
    }

    public int hashCode() {
        return Objects.hash(name, money, age, Math.random());
    }
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        Person that = (Person) ob;
        return Objects.equals(name + this.hashCode(), that.name + that.hashCode());
    }
}
