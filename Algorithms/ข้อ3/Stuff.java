import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Stuff {
    private String name;
    private double price;

    public List<Person> splitBill(List<Person> personList) {
        double shareBillEachPerson = this.price / personList.size();
        double maxBudget = 0;
        for (Person person : personList) {
            maxBudget = maxBudget + person.getWallet();
        }

        if (maxBudget < this.price) {
            throw new RuntimeException("not enough budget");
        } else {
            for (Person person : personList) {
                person.pay(shareBillEachPerson);
            }
            return personList;
        }
    }

    @Override
    public String toString() {
        return "Stuff{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
