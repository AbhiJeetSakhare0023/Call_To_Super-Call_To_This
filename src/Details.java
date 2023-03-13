class SBI
{
    String accHolder;
    public SBI(String accHolder) // 4
    {
        this.accHolder=accHolder; // 5
        System.out.println("SBI Account Holder: "+accHolder); // 6
    }
}
class Bank extends SBI{
    public Bank() // 2
    {
        super("Abhi Sakhare"); // 3 // explicit we added
    }
}
public class Details {
    public static void main(String[] args) {
        Bank b1 = new Bank(); // 1

    }

}
