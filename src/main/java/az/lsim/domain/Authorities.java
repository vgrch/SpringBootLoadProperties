package az.lsim.domain;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Authorities {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String authority;

    @Column(name="grant_date", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date grant_date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Date getGrant_date() {
        return grant_date;
    }

    public void setGrant_date(Date grant_date) {
        this.grant_date = grant_date;
    }
}
