package dk.netarkivet.jpa;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by csr on 9/2/14.
 */
@Entity
public class Extendedfieldtype {
    private long extendedfieldtypeId;
    private String name;

    @Id
    @Column(name = "extendedfieldtype_id")
    public long getExtendedfieldtypeId() {
        return extendedfieldtypeId;
    }

    public void setExtendedfieldtypeId(long extendedfieldtypeId) {
        this.extendedfieldtypeId = extendedfieldtypeId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Extendedfieldtype that = (Extendedfieldtype) o;

        if (extendedfieldtypeId != that.extendedfieldtypeId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (extendedfieldtypeId ^ (extendedfieldtypeId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
