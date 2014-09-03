package dk.netarkivet.jpa;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by csr on 9/2/14.
 */
@Entity
public class Passwords {
    private long passwordId;
    private String name;
    private String comments;
    private long domainId;
    private String url;
    private String realm;
    private String username;
    private String password;

    @Id
    @Column(name = "password_id")
    public long getPasswordId() {
        return passwordId;
    }

    public void setPasswordId(long passwordId) {
        this.passwordId = passwordId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "comments")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Basic
    @Column(name = "domain_id")
    public long getDomainId() {
        return domainId;
    }

    public void setDomainId(long domainId) {
        this.domainId = domainId;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "realm")
    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passwords passwords = (Passwords) o;

        if (domainId != passwords.domainId) return false;
        if (passwordId != passwords.passwordId) return false;
        if (comments != null ? !comments.equals(passwords.comments) : passwords.comments != null) return false;
        if (name != null ? !name.equals(passwords.name) : passwords.name != null) return false;
        if (password != null ? !password.equals(passwords.password) : passwords.password != null) return false;
        if (realm != null ? !realm.equals(passwords.realm) : passwords.realm != null) return false;
        if (url != null ? !url.equals(passwords.url) : passwords.url != null) return false;
        if (username != null ? !username.equals(passwords.username) : passwords.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (passwordId ^ (passwordId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (int) (domainId ^ (domainId >>> 32));
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (realm != null ? realm.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
