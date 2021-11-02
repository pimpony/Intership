import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Person {
    private String name;
    private double wallet;

    public void pay(double amount){
        this.wallet = this.wallet - amount;
    }


    @Override
    public String toString() {
        return "name: " + this.getName() + "\n" + "wallet: "+ this.getWallet() +"\n";
    }
}
