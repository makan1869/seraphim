package ir.serenade.seraphim.domain;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Content {

    public static enum ContentType {
        VIDEO, AUDIO, IMAGE, TEXT
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private  ContentType type;

    @ManyToOne(cascade = CascadeType.ALL)
    private File file;



    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<MetaData> metaDataSet;


    @ManyToMany()
    private Set<Tag> tags;


    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;

    @ManyToMany(mappedBy = "contents", cascade = CascadeType.ALL)
    private Set<Collection> collections;


}
