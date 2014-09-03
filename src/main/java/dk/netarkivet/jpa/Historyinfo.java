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
public class Historyinfo {
    private long historyinfoId;
    private int stopreason;
    private long objectcount;
    private long bytecount;
    private long configId;
    private long harvestId;
    private Long jobId;
    private Timestamp harvestTime;

    @Id
    @Column(name = "historyinfo_id")
    public long getHistoryinfoId() {
        return historyinfoId;
    }

    public void setHistoryinfoId(long historyinfoId) {
        this.historyinfoId = historyinfoId;
    }

    @Basic
    @Column(name = "stopreason")
    public int getStopreason() {
        return stopreason;
    }

    public void setStopreason(int stopreason) {
        this.stopreason = stopreason;
    }

    @Basic
    @Column(name = "objectcount")
    public long getObjectcount() {
        return objectcount;
    }

    public void setObjectcount(long objectcount) {
        this.objectcount = objectcount;
    }

    @Basic
    @Column(name = "bytecount")
    public long getBytecount() {
        return bytecount;
    }

    public void setBytecount(long bytecount) {
        this.bytecount = bytecount;
    }

    @Basic
    @Column(name = "config_id")
    public long getConfigId() {
        return configId;
    }

    public void setConfigId(long configId) {
        this.configId = configId;
    }

    @Basic
    @Column(name = "harvest_id")
    public long getHarvestId() {
        return harvestId;
    }

    public void setHarvestId(long harvestId) {
        this.harvestId = harvestId;
    }

    @Basic
    @Column(name = "job_id")
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    @Basic
    @Column(name = "harvest_time")
    public Timestamp getHarvestTime() {
        return harvestTime;
    }

    public void setHarvestTime(Timestamp harvestTime) {
        this.harvestTime = harvestTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Historyinfo that = (Historyinfo) o;

        if (bytecount != that.bytecount) return false;
        if (configId != that.configId) return false;
        if (harvestId != that.harvestId) return false;
        if (historyinfoId != that.historyinfoId) return false;
        if (objectcount != that.objectcount) return false;
        if (stopreason != that.stopreason) return false;
        if (harvestTime != null ? !harvestTime.equals(that.harvestTime) : that.harvestTime != null) return false;
        if (jobId != null ? !jobId.equals(that.jobId) : that.jobId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (historyinfoId ^ (historyinfoId >>> 32));
        result = 31 * result + stopreason;
        result = 31 * result + (int) (objectcount ^ (objectcount >>> 32));
        result = 31 * result + (int) (bytecount ^ (bytecount >>> 32));
        result = 31 * result + (int) (configId ^ (configId >>> 32));
        result = 31 * result + (int) (harvestId ^ (harvestId >>> 32));
        result = 31 * result + (jobId != null ? jobId.hashCode() : 0);
        result = 31 * result + (harvestTime != null ? harvestTime.hashCode() : 0);
        return result;
    }
}
