package people;

import assets.Share;
import assets.Shares;

import java.util.ArrayList;

public class DefaultShareMan extends ShareHolder{
    public DefaultShareMan(String name,int money, int age, String description){
        super(name, money, age, description);
    }

    public void getCheated(Shares target, Richman richman){
        for (Share i: (ArrayList<Share>) getShares().clone()){
            if (i.getName().equals(target)){
                sellShare(target, i.getAmount(), 50, richman);
            }
        }
    }
}
