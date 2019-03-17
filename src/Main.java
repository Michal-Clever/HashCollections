import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

    Cords cordsFirst = new Cords(1,1);
    Cords cordsSecond = new Cords(1,1);

        System.out.println(cordsFirst.hashCode());
        System.out.println(cordsSecond.hashCode());

        HashSet<Cords> set = new HashSet<>();
        set.add(cordsFirst);
        set.add(cordsSecond);

        System.out.println(set.size());



    }
}
// od Java 7:
// hashCode
// equals
// biblioteka Apache
// biblioteka Guava