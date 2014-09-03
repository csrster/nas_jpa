package dk.netarkivet.jpa;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by csr on 9/2/14.
 */
@Entity
public class Ordertemplates {
    private long templateId;
    private String name;
    private String orderxml;

    @Id
    @Column(name = "template_id")
    public long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(long templateId) {
        this.templateId = templateId;
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
    @Column(name = "orderxml")
    public String getOrderxml() {
        return orderxml;
    }

    public void setOrderxml(String orderxml) {
        this.orderxml = orderxml;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ordertemplates that = (Ordertemplates) o;

        if (templateId != that.templateId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (orderxml != null ? !orderxml.equals(that.orderxml) : that.orderxml != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (templateId ^ (templateId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (orderxml != null ? orderxml.hashCode() : 0);
        return result;
    }
}
