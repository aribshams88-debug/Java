public class Outerclass {

    String outerMessage = "This is Outer Class";

    public class InnerClass {

        void display() {
            System.out.println(outerMessage);
            System.out.println("This is Inner Class");
        }

        public void demoInnerClass() {
            InnerClass inner = new InnerClass();
            inner.display();
        }
    }

    public static void main(String[] args) {
        Outerclass outer = new Outerclass();
        Outerclass.InnerClass inner = outer.new InnerClass();
        inner.demoInnerClass();
    }
}
