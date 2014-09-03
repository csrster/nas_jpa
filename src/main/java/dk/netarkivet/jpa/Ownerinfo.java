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
public class Ownerinfo {
    private long ownerinfoId;
    private long domainId;
    private Timestamp created;
    private String info;

    @Id
    @Column(name = "ownerinfo_id")
    public long getOwnerinfoId() {
        return ownerinfoId;
    }

    public void setOwnerinfoId(long ownerinfoId) {
        this.ownerinfoId = ownerinfoId;
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
    @Column(name = "created")
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "info")
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ownerinfo ownerinfo = (Ownerinfo) o;

        if (domainId != ownerinfo.domainId) return false;
        if (ownerinfoId != ownerinfo.ownerinfoId) return false;
        if (created != null ? !created.equals(ownerinfo.created) : ownerinfo.created != null) return false;
        if (info != null ? !info.equals(ownerinfo.info) : ownerinfo.info != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (ownerinfoId ^ (ownerinfoId >>> 32));
        result = 31 * result + (int) (domainId ^ (domainId >>> 32));
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (info != null ? info.hashCode() : 0);
        return result;
    }
}
