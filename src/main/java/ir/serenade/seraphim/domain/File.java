package ir.serenade.seraphim.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class File {

    @Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "uuid", unique = true)
    private String uuid;

    @Column(nullable = false)
    private String mimeType;
    @Column(nullable = false)
    private String extension;
    @Column(nullable = false)
    private String checksum;
}
