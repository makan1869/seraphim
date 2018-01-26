package ir.serenade.seraphim.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<MetaData> metaDataSet;
}
