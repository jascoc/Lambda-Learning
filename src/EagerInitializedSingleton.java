public class EagerInitializedSingleton {

    public static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){};

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    public static void printCiao() {
        System.out.println("comes from singleton");
    }

    @Override
    public String toString() {
        return "EagerInitializedSingleton" + this.hashCode();
    }
}
