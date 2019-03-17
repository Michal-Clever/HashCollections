import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

    Cords cordsFirst = new Cords(1,1);
    Cords cordsSecond = new Cords(1,1);

        HashSet<Cords> set = new HashSet<>();
        set.add(cordsFirst);
        set.add(cordsSecond);

        System.out.println(set.size());



    }
}
