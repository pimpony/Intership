import java.util.ArrayList;
import java.util.List;

public class run {
    public static void main(String[] args) {
        Person p1 = new Person("Jane",30);
        Person p2 = new Person("Bow",20);
        Person p3 = new Person("Pin",10);

        var personList = new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        Stuff s1 = new Stuff("KFC",60);
        List<Person> remainingList = s1.splitBill(personList);
        System.out.println(remainingList);
    }
}
