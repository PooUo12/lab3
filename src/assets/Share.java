package assets;

public class Share implements HasPrice {
    private int price = (int) (5 * Math.random() + 7);
    private int amount;
    private Shares name;

    public Share(Shares name, int amount){
        this.name = name;
        this.amount = amount;
    }

    public int getPrice(){
        return price*amount;
    }

    public void changePrice(int change){
        if (change >= 0) price *= (1+ change/100);
        else price *= (1- change/100);
    }

    public Shares getName(){
        return name;
    }

    public int getAmount(){
        return amount;
    }

    public String toString(){
        return name.toString();
    }

    public void changeAmount(int change){
        amount += change;
    }
}

