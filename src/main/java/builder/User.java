package builder;

import lombok.*;


import java.util.List;

@Getter @Setter @Builder @ToString
public class User {
    private String name;
    private String gender;
    private int age;
    private int weight;
    private int height;
    private String race;
    @Singular private List<String> occupations;

}
