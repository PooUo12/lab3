package location;

import assets.Share;
import assets.Shares;
import people.DefaultShareMan;
import people.Richman;

import java.util.ArrayList;

public class Barge extends Location{
    ArrayList<DefaultShareMan> people = new ArrayList<>();
    public Barge(String name){
        super(name);
    }

    public void panic(Shares target, Richman richman){
        System.out.println("Баржа в панике, цены на акции падают");
        for (DefaultShareMan s: people){
                s.getCheated(target, richman);

        }
    }
    public void addMan(DefaultShareMan man){
        people.add(man);
    }
    public void describe(){
        System.out.println("На барже собрались акционеры:");
        for (DefaultShareMan s: people){
            System.out.print(s.getName() +" ");
        }
        System.out.println("");
    }
}
