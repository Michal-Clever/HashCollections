import java.util.HashMap;
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

        System.out.println(setPerson.iterator().next().getAge());

      //  HashMap<Person,String>

        // iteratorExample(setPerson);
    }

    private static void iteratorExample(HashSet<Person> setPerson) {
        //        // it won't work
//        for (Person person : setPerson) {
//            if(person.getAge()==42){
//                setPerson.remove(person);
//            }
//        }
        Iterator<Person> iter = setPerson.iterator();
        System.out.println(setPerson.size());
        while (iter.hasNext()) {
            Person someone = iter.next();
            //here the removal will work
            if (someone.getAge() == 42) {
                iter.remove();
            }

            System.out.println(someone.getAge());
        }
        System.out.println(setPerson.size());
    }

}
// od Java 7:
// hashCode
// equals
// biblioteka Apache
// biblioteka Guava