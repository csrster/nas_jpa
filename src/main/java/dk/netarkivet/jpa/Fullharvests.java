package dk.netarkivet.jpa;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by csr on 9/2/14.
 */
@Entity
public class Fullharvests {
    private long harvestId;
    private long maxobjects;
    private Long previoushd;
    private long maxbytes;
    private long maxjobrunningtime;
    private boolean isindexready;

    @Id
    @Column(name = "harvest_id")
    public long getHarvestId() {
        return harvestId;
    }

    public void setHarvestId(long harvestId) {
        this.harvestId = harvestId;
    }

    @Basic
    @Column(name = "maxobjects")
    public long getMaxobjects() {
        return maxobjects;
    }

    public void setMaxobjects(long maxobjects) {
        this.maxobjects = maxobjects;
    }

    @Basic
    @Column(name = "previoushd")
    public Long getPrevioushd() {
        return previoushd;
    }

    public void setPrevioushd(Long previoushd) {
        this.previoushd = previoushd;
    }

    @Basic
    @Column(name = "maxbytes")
    public long getMaxbytes() {
        return maxbytes;
    }

    public void setMaxbytes(long maxbytes) {
        this.maxbytes = maxbytes;
    }

    @Basic
    @Column(name = "maxjobrunningtime")
    public long getMaxjobrunningtime() {
        return maxjobrunningtime;
    }

    public void setMaxjobrunningtime(long maxjobrunningtime) {
        this.maxjobrunningtime = maxjobrunningtime;
    }

    @Basic
    @Column(name = "isindexready")
    public boolean isIsindexready() {
        return isindexready;
    }

    public void setIsindexready(boolean isindexready) {
        this.isindexready = isindexready;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fullharvests that = (Fullharvests) o;

        if (harvestId != that.harvestId) return false;
        if (isindexready != that.isindexready) return false;
        if (maxbytes != that.maxbytes) return false;
        if (maxjobrunningtime != that.maxjobrunningtime) return false;
        if (maxobjects != that.maxobjects) return false;
        if (previoushd != null ? !previoushd.equals(that.previoushd) : that.previoushd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (harvestId ^ (harvestId >>> 32));
        result = 31 * result + (int) (maxobjects ^ (maxobjects >>> 32));
        result = 31 * result + (previoushd != null ? previoushd.hashCode() : 0);
        result = 31 * result + (int) (maxbytes ^ (maxbytes >>> 32));
        result = 31 * result + (int) (maxjobrunningtime ^ (maxjobrunningtime >>> 32));
        result = 31 * result + (isindexready ? 1 : 0);
        return result;
    }
}
