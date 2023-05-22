package searchengine.model;

import javax.persistence.*;

@Entity
public class Lemma {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Column(name = "site_id")
    private Site site;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String lemma;

    @Column(nullable = false)
    private int frequency;
}
