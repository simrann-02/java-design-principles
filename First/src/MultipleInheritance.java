interface Parent1{
    void method1();
}
interface Parent2{
    void method1();
}
public class MultipleInheritance implements Parent1, Parent2 {
    public void method1(){
        System.out.println("This is method1");
    }
}

