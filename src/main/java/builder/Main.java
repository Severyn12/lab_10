package builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> data = new ArrayList();
        data.add("UCU");
        data.add("Business analyst");
        User nwUs = User.builder().age(12).occupations(data).build();
        System.out.println(nwUs);
    }
}
