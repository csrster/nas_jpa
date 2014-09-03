package dk.netarkivet.jpa;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by csr on 9/2/14.
 */
@Entity
public class Extendedfield {
    private long extendedfieldId;
    private long extendedfieldtypeId;
    private String name;
    private String format;
    private String defaultvalue;
    private String options;
    private int datatype;
    private int mandatory;
    private Integer sequencenr;

    @Id
    @Column(name = "extendedfield_id")
    public long getExtendedfieldId() {
        return extendedfieldId;
    }

    public void setExtendedfieldId(long extendedfieldId) {
        this.extendedfieldId = extendedfieldId;
    }

    @Basic
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

    @Basic
    @Column(name = "format")
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Basic
    @Column(name = "defaultvalue")
    public String getDefaultvalue() {
        return defaultvalue;
    }

    public void setDefaultvalue(String defaultvalue) {
        this.defaultvalue = defaultvalue;
    }

    @Basic
    @Column(name = "options")
    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    @Basic
    @Column(name = "datatype")
    public int getDatatype() {
        return datatype;
    }

    public void setDatatype(int datatype) {
        this.datatype = datatype;
    }

    @Basic
    @Column(name = "mandatory")
    public int getMandatory() {
        return mandatory;
    }

    public void setMandatory(int mandatory) {
        this.mandatory = mandatory;
    }

    @Basic
    @Column(name = "sequencenr")
    public Integer getSequencenr() {
        return sequencenr;
    }

    public void setSequencenr(Integer sequencenr) {
        this.sequencenr = sequencenr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Extendedfield that = (Extendedfield) o;

        if (datatype != that.datatype) return false;
        if (extendedfieldId != that.extendedfieldId) return false;
        if (extendedfieldtypeId != that.extendedfieldtypeId) return false;
        if (mandatory != that.mandatory) return false;
        if (defaultvalue != null ? !defaultvalue.equals(that.defaultvalue) : that.defaultvalue != null) return false;
        if (format != null ? !format.equals(that.format) : that.format != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (options != null ? !options.equals(that.options) : that.options != null) return false;
        if (sequencenr != null ? !sequencenr.equals(that.sequencenr) : that.sequencenr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (extendedfieldId ^ (extendedfieldId >>> 32));
        result = 31 * result + (int) (extendedfieldtypeId ^ (extendedfieldtypeId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (format != null ? format.hashCode() : 0);
        result = 31 * result + (defaultvalue != null ? defaultvalue.hashCode() : 0);
        result = 31 * result + (options != null ? options.hashCode() : 0);
        result = 31 * result + datatype;
        result = 31 * result + mandatory;
        result = 31 * result + (sequencenr != null ? sequencenr.hashCode() : 0);
        return result;
    }
}
