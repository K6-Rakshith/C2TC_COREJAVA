public final class FinalExample {

    // A final variable (constant)
    public final int myConstant = 42;

    // A constructor
    public FinalExample() {
        // You can initialize a final variable in the constructor
        // but you can't change it later.
        // myConstant = 50; // This would result in a compilation error.
    }

    // A final method
    public final void sayHello() {
        System.out.println("Hello, this is a final method.");
    }

    public static void main(String[] args) {
        FinalExample example = new FinalExample();
        System.out.println("Constant value: " + example.myConstant);
        example.sayHello();
    }
}
