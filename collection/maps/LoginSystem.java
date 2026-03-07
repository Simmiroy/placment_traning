package collection.maps;

import java.util.HashMap;
import java.util.Map;

public class LoginSystem {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("admin1", "user@234");
        users.put("User2", "user@34");
        users.put("admin1", "user@456"); //Update the password
        users.put("User5", "ouster#12");
        System.out.println("Admin Permanent: "+users.get("admin1"));
    }

}
