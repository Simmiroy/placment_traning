package collection.Sets;
import java.util.HashSet;
import java.util.Set;
public class EmailNotification {
    public static void main(String[] args) {

        Set<String>emailQueue =new HashSet<>();
        emailQueue.add("A@mail.com ");
        emailQueue.add("lo@mail.com ");
        emailQueue.add("B@mail.com ");
        emailQueue.add("AGmail.com ");
        emailQueue.add("A@mail.com ");
        emailQueue.add("B@mail.com ");
        System.out.println("Emails.to sent: "+emailQueue);
        System.out.println("Unique emails,: "+emailQueue.size());

    }
}
