package ir.serenade.seraphim.domain;

import javax.persistence.*;
import java.util.Set;



@Entity
public class Collection {

    public static enum CollectionType {
        PLAYLIST, ALBUM, SERIES, SEASON, SECTION, CHAPTER
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;


    @Enumerated(EnumType.STRING)
    private CollectionType  type;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<MetaData> metaDataSet;

    @ManyToOne
    private Collection parent;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Content> contents;


    @ManyToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private Set<Collection> collections;


    public String toString() {
        return name;
    }
}

