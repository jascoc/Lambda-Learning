public class SuperUser extends User{
    public SuperUser() {
        this.level = "Super";
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
