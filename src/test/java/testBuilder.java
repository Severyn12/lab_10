import builder.User;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testBuilder {


    @org.junit.jupiter.api.Test
    void testBuilder(){
        List<String> data = new ArrayList();
        data.add("Business analyst");
        data.add("Entrepreneur");
        User nwUser = User.builder().age(12).weight(64).name("Tom").occupations(data).build();
        assertEquals(nwUser.getAge(),12);
        assertEquals(nwUser.getWeight(), 64);
        assertEquals(nwUser.getName(), "Tom");
        assertEquals(nwUser.getOccupations().toString(),"[Business analyst, Entrepreneur]");
    }
}
