import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DemoDeserializationV2 {
    public static void main(String[] args) {
        try {
            String file_name = "serialized_object_v2.ser";

            FileInputStream fin = new FileInputStream(file_name);
            ObjectInputStream oin = new ObjectInputStream(fin);

            User super_user = (User) oin.readObject();  // actual deserialization process happens here
            oin.close();
            fin.close();
            System.out.println("The object was read from " + file_name + ":");
            System.out.println(super_user);
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}