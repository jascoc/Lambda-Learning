public class NormalUser extends User{
    public NormalUser() {
        this.level = "Normal";
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
