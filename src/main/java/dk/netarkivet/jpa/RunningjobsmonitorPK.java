package dk.netarkivet.jpa;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by csr on 9/4/14.
 */
public class RunningjobsmonitorPK implements Serializable {
    private long jobid;
    private String harvestname;

    @Column(name = "jobid")
    @Id
    public long getJobid() {
        return jobid;
    }

    public void setJobid(long jobid) {
        this.jobid = jobid;
    }

    @Column(name = "harvestname")
    @Id
    public String getHarvestname() {
        return harvestname;
    }

    public void setHarvestname(String harvestname) {
        this.harvestname = harvestname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RunningjobsmonitorPK that = (RunningjobsmonitorPK) o;

        if (jobid != that.jobid) return false;
        if (harvestname != null ? !harvestname.equals(that.harvestname) : that.harvestname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (jobid ^ (jobid >>> 32));
        result = 31 * result + (harvestname != null ? harvestname.hashCode() : 0);
        return result;
    }
}
