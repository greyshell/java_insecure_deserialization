import java.io.*;

public class DemoSerialization {
    public static void main(String[] args) {
        try {
            User user = new User("abhijit", "greyshell", 2, "mypass", 67.5);
            System.out.println(user); // equivalent to user.toString()

            String file_name = "serialized_object.ser";
            FileOutputStream fout = new FileOutputStream(file_name);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(user);
            oout.close();
            fout.close();
            System.out.println("User object is written to disk as " + file_name);

            System.out.println();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}