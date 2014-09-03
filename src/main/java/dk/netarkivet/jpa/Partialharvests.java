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
public class Partialharvests {
    private long harvestId;
    private long scheduleId;
    private Timestamp nextdate;

    @Id
    @Column(name = "harvest_id")
    public long getHarvestId() {
        return harvestId;
    }

    public void setHarvestId(long harvestId) {
        this.harvestId = harvestId;
    }

    @Basic
    @Column(name = "schedule_id")
    public long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(long scheduleId) {
        this.scheduleId = scheduleId;
    }

    @Basic
    @Column(name = "nextdate")
    public Timestamp getNextdate() {
        return nextdate;
    }

    public void setNextdate(Timestamp nextdate) {
        this.nextdate = nextdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Partialharvests that = (Partialharvests) o;

        if (harvestId != that.harvestId) return false;
        if (scheduleId != that.scheduleId) return false;
        if (nextdate != null ? !nextdate.equals(that.nextdate) : that.nextdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (harvestId ^ (harvestId >>> 32));
        result = 31 * result + (int) (scheduleId ^ (scheduleId >>> 32));
        result = 31 * result + (nextdate != null ? nextdate.hashCode() : 0);
        return result;
    }
}
