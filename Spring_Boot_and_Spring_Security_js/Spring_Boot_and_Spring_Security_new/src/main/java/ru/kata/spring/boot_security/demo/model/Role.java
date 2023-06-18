package ru.kata.spring.boot_security.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "role")
    private String role;

    //@ManyToMany (mappedBy = "roles")
    //private Set<User> users;
    @Override
    public String getAuthority() {
        return role;
    }
    @Override
    public String toString() {
        return role.substring(5);
    }
}
