import java.io.*;

public class DemoDeserialization {
    public static void main(String[] args) {
        try {
            // String file_name = "serialized_object.ser";
            String file_name = "dos_serialized_object.ser";

            FileInputStream fin = new FileInputStream(file_name);
            ObjectInputStream oin = new ObjectInputStream(fin);

            User user = (User) oin.readObject();  // actual deserialization process happens here
            oin.close();
            fin.close();
            System.out.println("The object was read from " + file_name + ":");
            System.out.println(user);
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}