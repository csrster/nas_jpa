package dk.netarkivet.jpa;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by csr on 9/2/14.
 */
public class FrontierreportmonitorPK implements Serializable {
    private long jobid;
    private String filterid;
    private String domainname;

    @Column(name = "jobid")
    @Id
    public long getJobid() {
        return jobid;
    }

    public void setJobid(long jobid) {
        this.jobid = jobid;
    }

    @Column(name = "filterid")
    @Id
    public String getFilterid() {
        return filterid;
    }

    public void setFilterid(String filterid) {
        this.filterid = filterid;
    }

    @Column(name = "domainname")
    @Id
    public String getDomainname() {
        return domainname;
    }

    public void setDomainname(String domainname) {
        this.domainname = domainname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FrontierreportmonitorPK that = (FrontierreportmonitorPK) o;

        if (jobid != that.jobid) return false;
        if (domainname != null ? !domainname.equals(that.domainname) : that.domainname != null) return false;
        if (filterid != null ? !filterid.equals(that.filterid) : that.filterid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (jobid ^ (jobid >>> 32));
        result = 31 * result + (filterid != null ? filterid.hashCode() : 0);
        result = 31 * result + (domainname != null ? domainname.hashCode() : 0);
        return result;
    }
}
