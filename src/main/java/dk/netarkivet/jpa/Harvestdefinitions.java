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
public class Harvestdefinitions {
    private long harvestId;
    private String name;
    private String comments;
    private int numevents;
    private Timestamp submitted;
    private boolean isactive;
    private long edition;
    private String audience;

    @Id
    @Column(name = "harvest_id")
    public long getHarvestId() {
        return harvestId;
    }

    public void setHarvestId(long harvestId) {
        this.harvestId = harvestId;
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
    @Column(name = "numevents")
    public int getNumevents() {
        return numevents;
    }

    public void setNumevents(int numevents) {
        this.numevents = numevents;
    }

    @Basic
    @Column(name = "submitted")
    public Timestamp getSubmitted() {
        return submitted;
    }

    public void setSubmitted(Timestamp submitted) {
        this.submitted = submitted;
    }

    @Basic
    @Column(name = "isactive")
    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    @Basic
    @Column(name = "edition")
    public long getEdition() {
        return edition;
    }

    public void setEdition(long edition) {
        this.edition = edition;
    }

    @Basic
    @Column(name = "audience")
    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Harvestdefinitions that = (Harvestdefinitions) o;

        if (edition != that.edition) return false;
        if (harvestId != that.harvestId) return false;
        if (isactive != that.isactive) return false;
        if (numevents != that.numevents) return false;
        if (audience != null ? !audience.equals(that.audience) : that.audience != null) return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (submitted != null ? !submitted.equals(that.submitted) : that.submitted != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (harvestId ^ (harvestId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + numevents;
        result = 31 * result + (submitted != null ? submitted.hashCode() : 0);
        result = 31 * result + (isactive ? 1 : 0);
        result = 31 * result + (int) (edition ^ (edition >>> 32));
        result = 31 * result + (audience != null ? audience.hashCode() : 0);
        return result;
    }
}
