class X{
    public X() // 6
    {
        this(1000); // 7
        System.out.println("X-class default Constructor"); // 10
    }
    public X(int i) // 8
    {
        System.out.println("X-class Integer Constructor"); // 9
    }
}
class Y extends X{
    public Y() // 2
    {
        this(100);// this() should be 1st. // 3
        System.out.println("Y-class default Constructor"); // 12
    }
    public Y(int i) // 4
    {
        super(); // super() should be 1st // 5
        System.out.println("Y-class Integer Constructor"); // 11
    }
}
public class Combination {
    public static void main(String[] args) {
        Y y1 = new Y(); // 1
    }

}
