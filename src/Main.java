import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class Main {
    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>();
        for(int i=0; i<10; i++) {
            n.add(i);
        }
        List<String> strings = new ArrayList<>();
        strings.add("Coap");
        //method stored in a variable
        Consumer<String> lambdaMethod = s -> {System.out.println(s);};
        //basic lambda function
        n.forEach( x -> {System.out.println(x);});
        strings.forEach(lambdaMethod);
        //pass a lambda function as parameter
        lambdaInterface test = s -> s + '!';
        method("C", test);
        EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
        System.out.println(singleton.hashCode());
    }

    interface lambdaInterface {
        String ciao(String s);
    }

    public static void method(String s, lambdaInterface s1) {
        System.out.println(s1.ciao(s));
    }
}


