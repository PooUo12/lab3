package people;

import assets.Article;
import assets.Newspaper;
import assets.Shares;

import java.util.ArrayList;

public class NewspaperHolder extends Person implements HasDescription{
    private ArrayList<Newspaper> newspapers = new ArrayList<>();
    private String description;

    public NewspaperHolder(String name, int money, int age, String description){
        super(name, money, age);
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public ArrayList<Newspaper> getNewspapers(){
        return newspapers;
    }

    public void writeArticle(Newspaper active, String name){
        if (newspapers.contains(active)){
            Article article = new Article(name, "Обычная");
            System.out.println(getDescription()+ " " + getName() + " написал статью " + name);
        } else System.out.println("Невозможно написать статью в не своей газете");
    }

    public void writeBoughtArticle(Newspaper active, String name, Shares target, int money){
        if (newspapers.contains(active)){
            Article article = new Article(name, target, "Купленная");
            System.out.println(getDescription()+ " " + getName() + " написал купленную статью " + name);
            changeMoney(money);
        }
    }

    public void sellNewspaper(Newspaper active){
        if (newspapers.contains(active)){
            changeMoney(active.getPrice());
            System.out.println("Успешно продал газету " + active.getName());
            newspapers.remove(active);
        } else System.out.println("Невозможно продать не свою газету");
    }

    public void buyNewspaper(Newspaper active){
        if (getMoney() >= active.getPrice()){
            changeMoney(-active.getPrice());
            System.out.println("Успешно купил газету" + active.getName());
            newspapers.add(active);
        } else System.out.println("Не хватает средств");
    }
}
