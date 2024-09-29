import java.io.*;

public class DemoSerializationV2 {

    public static void main(String[] args) {

        try {
            SuperUser super_user = new SuperUser(
                    "abhijit",
                    "sinha",
                    1,
                    "mypass",
                    67.5,
                    "admin"
            );

            String file_name = "serialized_object_v2.ser";
            FileOutputStream fout = new FileOutputStream(file_name);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(super_user);
            oout.close();
            fout.close();
            System.out.println("User object is written to disk as " + file_name);

            System.out.println();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}