package dk.netarkivet.jpa;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by csr on 9/2/14.
 */
@Entity
public class Extendedfieldvalue {
    private long extendedfieldvalueId;
    private long extendedfieldId;
    private long instanceId;
    private String content;

    @Id
    @Column(name = "extendedfieldvalue_id")
    public long getExtendedfieldvalueId() {
        return extendedfieldvalueId;
    }

    public void setExtendedfieldvalueId(long extendedfieldvalueId) {
        this.extendedfieldvalueId = extendedfieldvalueId;
    }

    @Basic
    @Column(name = "extendedfield_id")
    public long getExtendedfieldId() {
        return extendedfieldId;
    }

    public void setExtendedfieldId(long extendedfieldId) {
        this.extendedfieldId = extendedfieldId;
    }

    @Basic
    @Column(name = "instance_id")
    public long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(long instanceId) {
        this.instanceId = instanceId;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Extendedfieldvalue that = (Extendedfieldvalue) o;

        if (extendedfieldId != that.extendedfieldId) return false;
        if (extendedfieldvalueId != that.extendedfieldvalueId) return false;
        if (instanceId != that.instanceId) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (extendedfieldvalueId ^ (extendedfieldvalueId >>> 32));
        result = 31 * result + (int) (extendedfieldId ^ (extendedfieldId >>> 32));
        result = 31 * result + (int) (instanceId ^ (instanceId >>> 32));
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }
}
