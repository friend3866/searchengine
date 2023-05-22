package searchengine.model;

import javax.persistence.*;

@Entity
@Table(indexes = @Index(columnList = "site_id, path", unique = true))
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @Column(name = "site_id")
    private Site site;

    @Column(columnDefinition = "TEXT NOT NULL")
    private String path;

    @Column(nullable = false)
    private int code;

    @Column(columnDefinition = "MEDIUMTEXT NOT NULL")
    private String content;
}
