package org.atm.socialmedia.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "createdBy")
    private List<Post> posts;

    @Column(columnDefinition = "TEXT")
    private String bio;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
