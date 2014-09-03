package dk.netarkivet.jpa;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by csr on 9/2/14.
 */
@Entity
public class Schemaversions {
    private String tablename;
    private int version;

    @Id
    @Column(name = "tablename")
    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    @Basic
    @Column(name = "version")
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Schemaversions that = (Schemaversions) o;

        if (version != that.version) return false;
        if (tablename != null ? !tablename.equals(that.tablename) : that.tablename != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tablename != null ? tablename.hashCode() : 0;
        result = 31 * result + version;
        return result;
    }
}
