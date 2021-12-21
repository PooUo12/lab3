import assets.Newspaper;
import assets.Shares;
import location.Barge;
import people.DefaultShareMan;
import people.NewspaperHolder;
import people.Richman;

public class Main {
    public static void main(String[] args){
        Richman spruts = new Richman("Спрутс", 5000, 50, "Ненасытный");
        DefaultShareMan richard = new DefaultShareMan("Ричард", 500, 30, "Доверчивый");
        DefaultShareMan igor = new DefaultShareMan("Игорь", 400, 23, "Чудак");
        DefaultShareMan oleg = new DefaultShareMan("Олег",800,35,"Чудак");
        NewspaperHolder rolland = new NewspaperHolder("Ролланд", 100, 40, "Гадкий");
        NewspaperHolder gadkinz = new NewspaperHolder("Гадкинз", 300 , 45, "Смышленный");
        Newspaper davilonskieUmoreski = new Newspaper("Давилонские Юморески", 30,"Гаденькая");
        Newspaper gazeta = new Newspaper("Газета для любителей почитать лежа", 100, "Учащая");
        rolland.buyNewspaper(davilonskieUmoreski);
        gadkinz.buyNewspaper(gazeta);
        Barge barge = new Barge("Баржа");
        barge.addMan(richard);
        barge.addMan(igor);
        barge.addMan(oleg);
        richard.buyShareFromStock(Shares.GOVOR, 30);
        igor.buyShareFromStock(Shares.GOVOR, 20);
        igor.buyShareFromStock(Shares.GAZPROM, 5);
        igor.buyShareFromStock(Shares.RESIDE, 5);
        oleg.buyShareFromStock(Shares.GOVOR, 15);


        barge.describe();
        System.out.println("В это время в тайне от всех Спрутс платит Ролланду");
        rolland.writeBoughtArticle(davilonskieUmoreski, "Срочные известия об акциях Говор", Shares.GOVOR, 100);
        barge.panic(Shares.GOVOR, spruts);
        spruts.getCompany(Shares.GOVOR);
        gadkinz.writeArticle(gazeta, "Берегите карманы");
        System.out.println("Статья должна была предупредить акционеров, но уже слишком поздно...");
    }
}
