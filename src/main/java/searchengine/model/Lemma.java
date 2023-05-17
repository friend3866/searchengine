package searchengine.model;

import javax.persistence.*;

@Entity
public class Lemma {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @Column(name = "site_id")
    private int siteId;

    @Column(columnDefinition = "VARCHAR(255)")
    private String lemma;

    private int frequency;
}
