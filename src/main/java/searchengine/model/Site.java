package searchengine.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(columnDefinition = "ENUM('INDEXING', 'INDEXED', 'FAILED')")
    private Status status;

    @Column(name = "status_time", columnDefinition = "NOT NULL")
    private Date statusTime;

    @Column(name = "last_error", columnDefinition = "TEXT NOT NULL")
    private String lastError;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String url;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String name;



}
