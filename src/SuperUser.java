public class SuperUser extends User{

    private String role;

    public SuperUser(String first_name, String last_name, int uid, String password, double weight, String role) {
        super(first_name, last_name, uid, password, weight);
        this.role = role;
    }

    public String toString() {
        return role;
    }

    // Prevent deserialization
    private final void readObject(java.io.ObjectInputStream ois) throws java.io.IOException {
        throw new java.io.IOException("Deserialization not allowed for this class");
    }
}
