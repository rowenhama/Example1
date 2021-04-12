package Example1;

public class example1 {
    public static void main(String[] args) {
        Foo<String> f1 = new Foo<>();
        f1.a = "";

        Foo<String> f2 =new Foo<>(){

        };
        System.out.println(f1.a.getClass());
    }
}
