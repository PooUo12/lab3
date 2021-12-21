package assets;

import people.HasDescription;

public class Newspaper implements HasPrice, HasDescription {
    private String name;
    private int price;
    private String description;

    public Newspaper(String name, int price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}
