public class UserFactory {
    public static User createUser(String type) {
        switch (type.toLowerCase()) {
            case "normal":
                return new NormalUser();
            case "super":
                return new SuperUser();
            default:
                return null;
        }
    }
}
