public class StaticTestSon extends StaticTestFather{
static {
    System.out.println("son's static block");
}
StaticTestSon() {
    System.out.println("son's constructor");
}
public static void main(String[] args) {
    System.out.println("son's main()");
    StaticTestSon instance = new StaticTestSon();
}
}
