import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        Cords cordsFirst = new Cords(1, 1);
//        Cords cordsSecond = new Cords(1, 1);
//
//        System.out.println(cordsFirst.hashCode());
//        System.out.println(cordsSecond.hashCode());
//
//        HashSet<Cords> set = new HashSet<>();
//        set.add(cordsFirst);
//        set.add(cordsSecond);
//
//        System.out.println(set.size());
//
//        Patient patientFirst = new Patient("Jan", "Kowwalski", "Wawa");
//        Patient patientSecond = new Patient("Jan", "Kowwalski", "Wawa");
//
//        Set<Patient> setPatient = new HashSet<>();
//        setPatient.add(patientFirst);
//        setPatient.add(patientSecond);

        doesHasSetReplaceWhenEquals();
    }

    private static void doesHasSetReplaceWhenEquals() {
        HashSet<Person> setPerson = new HashSet<Person>();

        setPerson.add(new Person("Andrzej", "Golota", 52));
        setPerson.add(new Person("Andrzej", "Golota", 42));

        Iterator<Person> iter = setPerson.iterator();

//        // it won't work
//        for (Person person : setPerson) {
//            if(person.getAge()==42){
//                setPerson.remove(person);
//            }
//        }

        while (iter.hasNext()) {
            Person someone = iter.next();
            //here the removal will work
            if (someone.getAge() == 42) {
                iter.remove();
            }

            System.out.println(someone.getAge());
        }

    }

}
// od Java 7:
// hashCode
// equals
// biblioteka Apache
// biblioteka Guava