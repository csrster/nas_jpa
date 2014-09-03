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
public class Schedules {
    private long scheduleId;
    private String name;
    private String comments;
    private Timestamp startdate;
    private Timestamp enddate;
    private Long maxrepeats;
    private int timeunit;
    private long numtimeunits;
    private boolean anytime;
    private Integer onminute;
    private Integer onhour;
    private Integer ondayofweek;
    private Integer ondayofmonth;
    private long edition;

    @Id
    @Column(name = "schedule_id")
    public long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(long scheduleId) {
        this.scheduleId = scheduleId;
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
    @Column(name = "startdate")
    public Timestamp getStartdate() {
        return startdate;
    }

    public void setStartdate(Timestamp startdate) {
        this.startdate = startdate;
    }

    @Basic
    @Column(name = "enddate")
    public Timestamp getEnddate() {
        return enddate;
    }

    public void setEnddate(Timestamp enddate) {
        this.enddate = enddate;
    }

    @Basic
    @Column(name = "maxrepeats")
    public Long getMaxrepeats() {
        return maxrepeats;
    }

    public void setMaxrepeats(Long maxrepeats) {
        this.maxrepeats = maxrepeats;
    }

    @Basic
    @Column(name = "timeunit")
    public int getTimeunit() {
        return timeunit;
    }

    public void setTimeunit(int timeunit) {
        this.timeunit = timeunit;
    }

    @Basic
    @Column(name = "numtimeunits")
    public long getNumtimeunits() {
        return numtimeunits;
    }

    public void setNumtimeunits(long numtimeunits) {
        this.numtimeunits = numtimeunits;
    }

    @Basic
    @Column(name = "anytime")
    public boolean isAnytime() {
        return anytime;
    }

    public void setAnytime(boolean anytime) {
        this.anytime = anytime;
    }

    @Basic
    @Column(name = "onminute")
    public Integer getOnminute() {
        return onminute;
    }

    public void setOnminute(Integer onminute) {
        this.onminute = onminute;
    }

    @Basic
    @Column(name = "onhour")
    public Integer getOnhour() {
        return onhour;
    }

    public void setOnhour(Integer onhour) {
        this.onhour = onhour;
    }

    @Basic
    @Column(name = "ondayofweek")
    public Integer getOndayofweek() {
        return ondayofweek;
    }

    public void setOndayofweek(Integer ondayofweek) {
        this.ondayofweek = ondayofweek;
    }

    @Basic
    @Column(name = "ondayofmonth")
    public Integer getOndayofmonth() {
        return ondayofmonth;
    }

    public void setOndayofmonth(Integer ondayofmonth) {
        this.ondayofmonth = ondayofmonth;
    }

    @Basic
    @Column(name = "edition")
    public long getEdition() {
        return edition;
    }

    public void setEdition(long edition) {
        this.edition = edition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Schedules schedules = (Schedules) o;

        if (anytime != schedules.anytime) return false;
        if (edition != schedules.edition) return false;
        if (numtimeunits != schedules.numtimeunits) return false;
        if (scheduleId != schedules.scheduleId) return false;
        if (timeunit != schedules.timeunit) return false;
        if (comments != null ? !comments.equals(schedules.comments) : schedules.comments != null) return false;
        if (enddate != null ? !enddate.equals(schedules.enddate) : schedules.enddate != null) return false;
        if (maxrepeats != null ? !maxrepeats.equals(schedules.maxrepeats) : schedules.maxrepeats != null) return false;
        if (name != null ? !name.equals(schedules.name) : schedules.name != null) return false;
        if (ondayofmonth != null ? !ondayofmonth.equals(schedules.ondayofmonth) : schedules.ondayofmonth != null)
            return false;
        if (ondayofweek != null ? !ondayofweek.equals(schedules.ondayofweek) : schedules.ondayofweek != null)
            return false;
        if (onhour != null ? !onhour.equals(schedules.onhour) : schedules.onhour != null) return false;
        if (onminute != null ? !onminute.equals(schedules.onminute) : schedules.onminute != null) return false;
        if (startdate != null ? !startdate.equals(schedules.startdate) : schedules.startdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (scheduleId ^ (scheduleId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (startdate != null ? startdate.hashCode() : 0);
        result = 31 * result + (enddate != null ? enddate.hashCode() : 0);
        result = 31 * result + (maxrepeats != null ? maxrepeats.hashCode() : 0);
        result = 31 * result + timeunit;
        result = 31 * result + (int) (numtimeunits ^ (numtimeunits >>> 32));
        result = 31 * result + (anytime ? 1 : 0);
        result = 31 * result + (onminute != null ? onminute.hashCode() : 0);
        result = 31 * result + (onhour != null ? onhour.hashCode() : 0);
        result = 31 * result + (ondayofweek != null ? ondayofweek.hashCode() : 0);
        result = 31 * result + (ondayofmonth != null ? ondayofmonth.hashCode() : 0);
        result = 31 * result + (int) (edition ^ (edition >>> 32));
        return result;
    }
}
