package transientKeyword;

import java.io.*;

public class User implements Serializable{
        String USername="Saurav";
        transient String password ="12345";
    }
    class TransientDemo{
        public static void main(String[] args)throws Exception {
            User user =new User();
            ObjectOutputStream obs= new ObjectOutputStream(new FileOutputStream("user.ser"));
            obs.writeObject(user);
            obs.close();
            ObjectInputStream ois =new ObjectInputStream(new FileInputStream("user.ser"));
            User user1 = (User) ois.readObject();
            System.out.println(user1.USername);
            System.out.println(user1.password);
        }
    }

