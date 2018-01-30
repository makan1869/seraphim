package ir.serenade.seraphim.domain;

import javax.persistence.*;
import java.util.Date;

public class Person {

    public static enum Gender { MALE, FEMALE}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String firstName;
    private String lastName;
    private Date birtDate;
    private File avatar;
    @Enumerated(EnumType.STRING)
    private Gender gender;

}
