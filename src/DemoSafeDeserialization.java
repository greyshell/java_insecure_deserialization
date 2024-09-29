import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoSafeDeserialization {
    public static void main(String[] args) {
        try {
            // String file_name = "serialized_object.ser";
            String file_name = "dos_serialized_object.ser";

            FileInputStream fin = new FileInputStream(file_name);
            // fix: whitelist based approach, resolve classes from the serialized object
            Set<String> whitelist = new HashSet<>(List.of("User"));
            ObjectInputStream oin = new SafeObjectInputStream(fin, whitelist);

            User user = (User) oin.readObject();  // actual deserialization process happens here
            oin.close();
            fin.close();
            System.out.println("The object was read from " + file_name);
            System.out.println(user);
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
