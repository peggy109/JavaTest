public class OuterTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        // invalid
//        Outer.Inner inner = new Outer.Inner();
        Outer.Inner inner = outer.new Inner();
    }
}
