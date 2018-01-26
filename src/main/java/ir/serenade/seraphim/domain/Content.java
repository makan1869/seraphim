package ir.serenade.seraphim.domain;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Content {

    public static enum ContentType {
        SERIES, SEASON, ALBUM, MOVIE, TRACK, IMAGE, TEXT
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private  ContentType type;

    @ManyToOne(cascade = CascadeType.ALL)
    private File file;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<MetaData> metaDataSet;


    @ManyToMany()
    private Set<Tag> tags;


    @ManyToOne()
    private Category category;


}
