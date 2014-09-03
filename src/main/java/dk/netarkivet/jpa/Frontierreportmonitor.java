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
@IdClass(FrontierreportmonitorPK.class)
public class Frontierreportmonitor {
    private long jobid;
    private String filterid;
    private Timestamp tstamp;
    private String domainname;
    private long currentsize;
    private long totalenqueues;
    private long sessionbalance;
    private BigInteger lastcost;
    private BigInteger averagecost;
    private String lastdequeuetime;
    private String waketime;
    private long totalspend;
    private long totalbudget;
    private long errorcount;
    private String lastpeekuri;
    private String lastqueueduri;

    @Id
    @Column(name = "jobid")
    public long getJobid() {
        return jobid;
    }

    public void setJobid(long jobid) {
        this.jobid = jobid;
    }

    @Id
    @Column(name = "filterid")
    public String getFilterid() {
        return filterid;
    }

    public void setFilterid(String filterid) {
        this.filterid = filterid;
    }

    @Basic
    @Column(name = "tstamp")
    public Timestamp getTstamp() {
        return tstamp;
    }

    public void setTstamp(Timestamp tstamp) {
        this.tstamp = tstamp;
    }

    @Id
    @Column(name = "domainname")
    public String getDomainname() {
        return domainname;
    }

    public void setDomainname(String domainname) {
        this.domainname = domainname;
    }

    @Basic
    @Column(name = "currentsize")
    public long getCurrentsize() {
        return currentsize;
    }

    public void setCurrentsize(long currentsize) {
        this.currentsize = currentsize;
    }

    @Basic
    @Column(name = "totalenqueues")
    public long getTotalenqueues() {
        return totalenqueues;
    }

    public void setTotalenqueues(long totalenqueues) {
        this.totalenqueues = totalenqueues;
    }

    @Basic
    @Column(name = "sessionbalance")
    public long getSessionbalance() {
        return sessionbalance;
    }

    public void setSessionbalance(long sessionbalance) {
        this.sessionbalance = sessionbalance;
    }

    @Basic
    @Column(name = "lastcost")
    public BigInteger getLastcost() {
        return lastcost;
    }

    public void setLastcost(BigInteger lastcost) {
        this.lastcost = lastcost;
    }

    @Basic
    @Column(name = "averagecost")
    public BigInteger getAveragecost() {
        return averagecost;
    }

    public void setAveragecost(BigInteger averagecost) {
        this.averagecost = averagecost;
    }

    @Basic
    @Column(name = "lastdequeuetime")
    public String getLastdequeuetime() {
        return lastdequeuetime;
    }

    public void setLastdequeuetime(String lastdequeuetime) {
        this.lastdequeuetime = lastdequeuetime;
    }

    @Basic
    @Column(name = "waketime")
    public String getWaketime() {
        return waketime;
    }

    public void setWaketime(String waketime) {
        this.waketime = waketime;
    }

    @Basic
    @Column(name = "totalspend")
    public long getTotalspend() {
        return totalspend;
    }

    public void setTotalspend(long totalspend) {
        this.totalspend = totalspend;
    }

    @Basic
    @Column(name = "totalbudget")
    public long getTotalbudget() {
        return totalbudget;
    }

    public void setTotalbudget(long totalbudget) {
        this.totalbudget = totalbudget;
    }

    @Basic
    @Column(name = "errorcount")
    public long getErrorcount() {
        return errorcount;
    }

    public void setErrorcount(long errorcount) {
        this.errorcount = errorcount;
    }

    @Basic
    @Column(name = "lastpeekuri")
    public String getLastpeekuri() {
        return lastpeekuri;
    }

    public void setLastpeekuri(String lastpeekuri) {
        this.lastpeekuri = lastpeekuri;
    }

    @Basic
    @Column(name = "lastqueueduri")
    public String getLastqueueduri() {
        return lastqueueduri;
    }

    public void setLastqueueduri(String lastqueueduri) {
        this.lastqueueduri = lastqueueduri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Frontierreportmonitor that = (Frontierreportmonitor) o;

        if (currentsize != that.currentsize) return false;
        if (errorcount != that.errorcount) return false;
        if (jobid != that.jobid) return false;
        if (sessionbalance != that.sessionbalance) return false;
        if (totalbudget != that.totalbudget) return false;
        if (totalenqueues != that.totalenqueues) return false;
        if (totalspend != that.totalspend) return false;
        if (averagecost != null ? !averagecost.equals(that.averagecost) : that.averagecost != null) return false;
        if (domainname != null ? !domainname.equals(that.domainname) : that.domainname != null) return false;
        if (filterid != null ? !filterid.equals(that.filterid) : that.filterid != null) return false;
        if (lastcost != null ? !lastcost.equals(that.lastcost) : that.lastcost != null) return false;
        if (lastdequeuetime != null ? !lastdequeuetime.equals(that.lastdequeuetime) : that.lastdequeuetime != null)
            return false;
        if (lastpeekuri != null ? !lastpeekuri.equals(that.lastpeekuri) : that.lastpeekuri != null) return false;
        if (lastqueueduri != null ? !lastqueueduri.equals(that.lastqueueduri) : that.lastqueueduri != null)
            return false;
        if (tstamp != null ? !tstamp.equals(that.tstamp) : that.tstamp != null) return false;
        if (waketime != null ? !waketime.equals(that.waketime) : that.waketime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (jobid ^ (jobid >>> 32));
        result = 31 * result + (filterid != null ? filterid.hashCode() : 0);
        result = 31 * result + (tstamp != null ? tstamp.hashCode() : 0);
        result = 31 * result + (domainname != null ? domainname.hashCode() : 0);
        result = 31 * result + (int) (currentsize ^ (currentsize >>> 32));
        result = 31 * result + (int) (totalenqueues ^ (totalenqueues >>> 32));
        result = 31 * result + (int) (sessionbalance ^ (sessionbalance >>> 32));
        result = 31 * result + (lastcost != null ? lastcost.hashCode() : 0);
        result = 31 * result + (averagecost != null ? averagecost.hashCode() : 0);
        result = 31 * result + (lastdequeuetime != null ? lastdequeuetime.hashCode() : 0);
        result = 31 * result + (waketime != null ? waketime.hashCode() : 0);
        result = 31 * result + (int) (totalspend ^ (totalspend >>> 32));
        result = 31 * result + (int) (totalbudget ^ (totalbudget >>> 32));
        result = 31 * result + (int) (errorcount ^ (errorcount >>> 32));
        result = 31 * result + (lastpeekuri != null ? lastpeekuri.hashCode() : 0);
        result = 31 * result + (lastqueueduri != null ? lastqueueduri.hashCode() : 0);
        return result;
    }
}
