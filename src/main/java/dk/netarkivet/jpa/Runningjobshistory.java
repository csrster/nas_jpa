package dk.netarkivet.jpa;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by csr on 9/2/14.
 */
@Entity
@IdClass(RunningjobshistoryPK.class)
public class Runningjobshistory {
    private long jobid;
    private String harvestname;
    private String hosturl;
    private BigInteger progress;
    private long queuedfilescount;
    private long totalqueuescount;
    private long activequeuescount;
    private long retiredqueuescount;
    private long exhaustedqueuescount;
    private long elapsedseconds;
    private long alertscount;
    private long downloadedfilescount;
    private int currentprocessedkbpersec;
    private int processedkbpersec;
    private BigInteger currentprocesseddocspersec;
    private BigInteger processeddocspersec;
    private int activetoecount;
    private int status;
    private Timestamp tstamp;

    @Id
    @Column(name = "jobid")
    public long getJobid() {
        return jobid;
    }

    public void setJobid(long jobid) {
        this.jobid = jobid;
    }

    @Id
    @Column(name = "harvestname")
    public String getHarvestname() {
        return harvestname;
    }

    public void setHarvestname(String harvestname) {
        this.harvestname = harvestname;
    }

    @Basic
    @Column(name = "hosturl")
    public String getHosturl() {
        return hosturl;
    }

    public void setHosturl(String hosturl) {
        this.hosturl = hosturl;
    }

    @Basic
    @Column(name = "progress")
    public BigInteger getProgress() {
        return progress;
    }

    public void setProgress(BigInteger progress) {
        this.progress = progress;
    }

    @Basic
    @Column(name = "queuedfilescount")
    public long getQueuedfilescount() {
        return queuedfilescount;
    }

    public void setQueuedfilescount(long queuedfilescount) {
        this.queuedfilescount = queuedfilescount;
    }

    @Basic
    @Column(name = "totalqueuescount")
    public long getTotalqueuescount() {
        return totalqueuescount;
    }

    public void setTotalqueuescount(long totalqueuescount) {
        this.totalqueuescount = totalqueuescount;
    }

    @Basic
    @Column(name = "activequeuescount")
    public long getActivequeuescount() {
        return activequeuescount;
    }

    public void setActivequeuescount(long activequeuescount) {
        this.activequeuescount = activequeuescount;
    }

    @Basic
    @Column(name = "retiredqueuescount")
    public long getRetiredqueuescount() {
        return retiredqueuescount;
    }

    public void setRetiredqueuescount(long retiredqueuescount) {
        this.retiredqueuescount = retiredqueuescount;
    }

    @Basic
    @Column(name = "exhaustedqueuescount")
    public long getExhaustedqueuescount() {
        return exhaustedqueuescount;
    }

    public void setExhaustedqueuescount(long exhaustedqueuescount) {
        this.exhaustedqueuescount = exhaustedqueuescount;
    }

    @Id
    @Column(name = "elapsedseconds")
    public long getElapsedseconds() {
        return elapsedseconds;
    }

    public void setElapsedseconds(long elapsedseconds) {
        this.elapsedseconds = elapsedseconds;
    }

    @Basic
    @Column(name = "alertscount")
    public long getAlertscount() {
        return alertscount;
    }

    public void setAlertscount(long alertscount) {
        this.alertscount = alertscount;
    }

    @Basic
    @Column(name = "downloadedfilescount")
    public long getDownloadedfilescount() {
        return downloadedfilescount;
    }

    public void setDownloadedfilescount(long downloadedfilescount) {
        this.downloadedfilescount = downloadedfilescount;
    }

    @Basic
    @Column(name = "currentprocessedkbpersec")
    public int getCurrentprocessedkbpersec() {
        return currentprocessedkbpersec;
    }

    public void setCurrentprocessedkbpersec(int currentprocessedkbpersec) {
        this.currentprocessedkbpersec = currentprocessedkbpersec;
    }

    @Basic
    @Column(name = "processedkbpersec")
    public int getProcessedkbpersec() {
        return processedkbpersec;
    }

    public void setProcessedkbpersec(int processedkbpersec) {
        this.processedkbpersec = processedkbpersec;
    }

    @Basic
    @Column(name = "currentprocesseddocspersec")
    public BigInteger getCurrentprocesseddocspersec() {
        return currentprocesseddocspersec;
    }

    public void setCurrentprocesseddocspersec(BigInteger currentprocesseddocspersec) {
        this.currentprocesseddocspersec = currentprocesseddocspersec;
    }

    @Basic
    @Column(name = "processeddocspersec")
    public BigInteger getProcesseddocspersec() {
        return processeddocspersec;
    }

    public void setProcesseddocspersec(BigInteger processeddocspersec) {
        this.processeddocspersec = processeddocspersec;
    }

    @Basic
    @Column(name = "activetoecount")
    public int getActivetoecount() {
        return activetoecount;
    }

    public void setActivetoecount(int activetoecount) {
        this.activetoecount = activetoecount;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Id
    @Column(name = "tstamp")
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

        Runningjobshistory that = (Runningjobshistory) o;

        if (activequeuescount != that.activequeuescount) return false;
        if (activetoecount != that.activetoecount) return false;
        if (alertscount != that.alertscount) return false;
        if (currentprocessedkbpersec != that.currentprocessedkbpersec) return false;
        if (downloadedfilescount != that.downloadedfilescount) return false;
        if (elapsedseconds != that.elapsedseconds) return false;
        if (exhaustedqueuescount != that.exhaustedqueuescount) return false;
        if (jobid != that.jobid) return false;
        if (processedkbpersec != that.processedkbpersec) return false;
        if (queuedfilescount != that.queuedfilescount) return false;
        if (retiredqueuescount != that.retiredqueuescount) return false;
        if (status != that.status) return false;
        if (totalqueuescount != that.totalqueuescount) return false;
        if (currentprocesseddocspersec != null ? !currentprocesseddocspersec.equals(that.currentprocesseddocspersec) : that.currentprocesseddocspersec != null)
            return false;
        if (harvestname != null ? !harvestname.equals(that.harvestname) : that.harvestname != null) return false;
        if (hosturl != null ? !hosturl.equals(that.hosturl) : that.hosturl != null) return false;
        if (processeddocspersec != null ? !processeddocspersec.equals(that.processeddocspersec) : that.processeddocspersec != null)
            return false;
        if (progress != null ? !progress.equals(that.progress) : that.progress != null) return false;
        if (tstamp != null ? !tstamp.equals(that.tstamp) : that.tstamp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (jobid ^ (jobid >>> 32));
        result = 31 * result + (harvestname != null ? harvestname.hashCode() : 0);
        result = 31 * result + (hosturl != null ? hosturl.hashCode() : 0);
        result = 31 * result + (progress != null ? progress.hashCode() : 0);
        result = 31 * result + (int) (queuedfilescount ^ (queuedfilescount >>> 32));
        result = 31 * result + (int) (totalqueuescount ^ (totalqueuescount >>> 32));
        result = 31 * result + (int) (activequeuescount ^ (activequeuescount >>> 32));
        result = 31 * result + (int) (retiredqueuescount ^ (retiredqueuescount >>> 32));
        result = 31 * result + (int) (exhaustedqueuescount ^ (exhaustedqueuescount >>> 32));
        result = 31 * result + (int) (elapsedseconds ^ (elapsedseconds >>> 32));
        result = 31 * result + (int) (alertscount ^ (alertscount >>> 32));
        result = 31 * result + (int) (downloadedfilescount ^ (downloadedfilescount >>> 32));
        result = 31 * result + currentprocessedkbpersec;
        result = 31 * result + processedkbpersec;
        result = 31 * result + (currentprocesseddocspersec != null ? currentprocesseddocspersec.hashCode() : 0);
        result = 31 * result + (processeddocspersec != null ? processeddocspersec.hashCode() : 0);
        result = 31 * result + activetoecount;
        result = 31 * result + status;
        result = 31 * result + (tstamp != null ? tstamp.hashCode() : 0);
        return result;
    }
}
