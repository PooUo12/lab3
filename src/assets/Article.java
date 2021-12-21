package assets;

import people.HasDescription;

public class Article implements HasDescription {
    private String name;
    private Shares target;
    private String description;
    public Article(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Article(String name, Shares target, String description){
        this.name = name;
        this.target = target;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public Shares getTarget(){
        return target;
    }
}
