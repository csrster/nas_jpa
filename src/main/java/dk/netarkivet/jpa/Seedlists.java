package dk.netarkivet.jpa;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by csr on 9/2/14.
 */
@Entity
public class Seedlists {
    private long seedlistId;
    private String name;
    private String comments;
    private long domainId;
    private String seeds;

    @Id
    @Column(name = "seedlist_id")
    public long getSeedlistId() {
        return seedlistId;
    }

    public void setSeedlistId(long seedlistId) {
        this.seedlistId = seedlistId;
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
    @Column(name = "seeds")
    public String getSeeds() {
        return seeds;
    }

    public void setSeeds(String seeds) {
        this.seeds = seeds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seedlists seedlists = (Seedlists) o;

        if (domainId != seedlists.domainId) return false;
        if (seedlistId != seedlists.seedlistId) return false;
        if (comments != null ? !comments.equals(seedlists.comments) : seedlists.comments != null) return false;
        if (name != null ? !name.equals(seedlists.name) : seedlists.name != null) return false;
        if (seeds != null ? !seeds.equals(seedlists.seeds) : seedlists.seeds != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (seedlistId ^ (seedlistId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (int) (domainId ^ (domainId >>> 32));
        result = 31 * result + (seeds != null ? seeds.hashCode() : 0);
        return result;
    }
}
