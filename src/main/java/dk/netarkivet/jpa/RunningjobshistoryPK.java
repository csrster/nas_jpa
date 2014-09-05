package dk.netarkivet.jpa;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by csr on 9/4/14.
 */
public class RunningjobshistoryPK implements Serializable {
    private long jobid;

    @Column(name = "jobid")
    @Id
    public long getJobid() {
        return jobid;
    }

    public void setJobid(long jobid) {
        this.jobid = jobid;
    }

    private String harvestname;

    @Column(name = "harvestname")
    @Id
    public String getHarvestname() {
        return harvestname;
    }

    public void setHarvestname(String harvestname) {
        this.harvestname = harvestname;
    }

    private long elapsedseconds;

    @Column(name = "elapsedseconds")
    @Id
    public long getElapsedseconds() {
        return elapsedseconds;
    }

    public void setElapsedseconds(long elapsedseconds) {
        this.elapsedseconds = elapsedseconds;
    }

    private Timestamp tstamp;

    @Column(name = "tstamp")
    @Id
    public Timestamp getTstamp() {
        return tstamp;
    }

    public void setTstamp(Timestamp tstamp) {
        this.tstamp = tstamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RunningjobshistoryPK that = (RunningjobshistoryPK) o;

        if (elapsedseconds != that.elapsedseconds) return false;
        if (jobid != that.jobid) return false;
        if (harvestname != null ? !harvestname.equals(that.harvestname) : that.harvestname != null) return false;
        if (tstamp != null ? !tstamp.equals(that.tstamp) : that.tstamp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (jobid ^ (jobid >>> 32));
        result = 31 * result + (harvestname != null ? harvestname.hashCode() : 0);
        result = 31 * result + (int) (elapsedseconds ^ (elapsedseconds >>> 32));
        result = 31 * result + (tstamp != null ? tstamp.hashCode() : 0);
        return result;
    }
}
