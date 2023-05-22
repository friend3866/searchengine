package searchengine.model;

import javax.persistence.*;

@Entity
@Table(name = "index",
        uniqueConstraints = @UniqueConstraint(columnNames = {"page_id", "lemma_id"}))
public class Index {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @ManyToOne
    @Column(name = "page_id")
    private Page page;

    @ManyToOne
    @Column(name = "lemma_id")
    private Lemma lemma;

    @Column(nullable = false)
    private float rank;
}
