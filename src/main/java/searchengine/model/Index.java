package searchengine.model;

import javax.persistence.*;

@Entity
public class Index {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @Column(name = "page_id")
    private int pageId;

    @Column(name = "lemma_id")
    private int lemmaId;

    private float rank;
}
