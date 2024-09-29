import java.io.*;

public class User implements Serializable {
    private String first_name;
    private final String last_name;  // final keyword: no impact on serialization
    static int uid;  // static keyword: this variable does not get serialized, int default value = 0
    private transient String password; // transient keyword: this variable does not get serialized, String default value = null
    private double weight;

    public User(String first_name, String last_name, int uid, String password, double weight) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.uid = uid;
        this.password = password;
        this.weight = weight;
    }


    // System.out.println(user) -> calls the Strings.toString() method
    public String toString() {
        return first_name + " : " + last_name + " : " + uid + " : " + password + " : " + weight;
    }

}