package ir.serenade.seraphim.domain;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;

@Entity
public class MetaData {

    public static enum MetaType {
        FILE, TEXT
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "key_", nullable = false)
    private String key;

    @Column(nullable = true)
    private String value;

    @ManyToOne(cascade = CascadeType.ALL)
    private File file;
}
