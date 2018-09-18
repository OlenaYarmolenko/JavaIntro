package Third;

public class Programm3 {

    public static void main(String[] args) {
        Bee bee1 = new Bee (1.5, new AttackImpl("Sting","Crawl"));
        bee1.move();
        bee1.attack();

        Bee bee2 = new Bee ("Green", 2.5);
        bee2.move();
        bee2.attack();
    }

}
