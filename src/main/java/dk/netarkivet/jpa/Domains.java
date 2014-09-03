package dk.netarkivet.jpa;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by csr on 9/2/14.
 */
@Entity
public class Domains {
    private long domainId;
    private String name;
    private String comments;
    private long defaultconfig;
    private String crawlertraps;
    private long edition;
    private Long alias;
    private Timestamp lastaliasupdate;

    @Id
    @Column(name = "domain_id")
    public long getDomainId() {
        return domainId;
    }

    public void setDomainId(long domainId) {
        this.domainId = domainId;
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
    @Column(name = "defaultconfig")
    public long getDefaultconfig() {
        return defaultconfig;
    }

    public void setDefaultconfig(long defaultconfig) {
        this.defaultconfig = defaultconfig;
    }

    @Basic
    @Column(name = "crawlertraps")
    public String getCrawlertraps() {
        return crawlertraps;
    }

    public void setCrawlertraps(String crawlertraps) {
        this.crawlertraps = crawlertraps;
    }

    @Basic
    @Column(name = "edition")
    public long getEdition() {
        return edition;
    }

    public void setEdition(long edition) {
        this.edition = edition;
    }

    @Basic
    @Column(name = "alias")
    public Long getAlias() {
        return alias;
    }

    public void setAlias(Long alias) {
        this.alias = alias;
    }

    @Basic
    @Column(name = "lastaliasupdate")
    public Timestamp getLastaliasupdate() {
        return lastaliasupdate;
    }

    public void setLastaliasupdate(Timestamp lastaliasupdate) {
        this.lastaliasupdate = lastaliasupdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Domains domains = (Domains) o;

        if (defaultconfig != domains.defaultconfig) return false;
        if (domainId != domains.domainId) return false;
        if (edition != domains.edition) return false;
        if (alias != null ? !alias.equals(domains.alias) : domains.alias != null) return false;
        if (comments != null ? !comments.equals(domains.comments) : domains.comments != null) return false;
        if (crawlertraps != null ? !crawlertraps.equals(domains.crawlertraps) : domains.crawlertraps != null)
            return false;
        if (lastaliasupdate != null ? !lastaliasupdate.equals(domains.lastaliasupdate) : domains.lastaliasupdate != null)
            return false;
        if (name != null ? !name.equals(domains.name) : domains.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (domainId ^ (domainId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (int) (defaultconfig ^ (defaultconfig >>> 32));
        result = 31 * result + (crawlertraps != null ? crawlertraps.hashCode() : 0);
        result = 31 * result + (int) (edition ^ (edition >>> 32));
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (lastaliasupdate != null ? lastaliasupdate.hashCode() : 0);
        return result;
    }
}
