package ir.serenade.seraphim.domain;

import javax.persistence.*;

@Entity
public class Cast {

    public static enum CastingType {
        DIRECTOR, AUTHOR, ARTIST, COMPOSER
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Person person;

    @ManyToOne(fetch = FetchType.EAGER)
    private Content content;

    @ManyToOne(fetch = FetchType.EAGER)
    private Collection collection;


}
