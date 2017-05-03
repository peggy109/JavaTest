public class StaticTestFather {
static {
    System.out.println("father's static block");
}
StaticTestFather() {
    System.out.println("father's constructor");
}
}
