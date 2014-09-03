package dk.netarkivet.jpa;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by csr on 9/2/14.
 */
@Entity
public class Configurations {
    private long configId;
    private String name;
    private String comments;
    private long domainId;
    private long templateId;
    private long maxobjects;
    private Integer maxrate;
    private Long overridelimits;
    private long maxbytes;

    @Id
    @Column(name = "config_id")
    public long getConfigId() {
        return configId;
    }

    public void setConfigId(long configId) {
        this.configId = configId;
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
    @Column(name = "domain_id")
    public long getDomainId() {
        return domainId;
    }

    public void setDomainId(long domainId) {
        this.domainId = domainId;
    }

    @Basic
    @Column(name = "template_id")
    public long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(long templateId) {
        this.templateId = templateId;
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
    @Column(name = "maxrate")
    public Integer getMaxrate() {
        return maxrate;
    }

    public void setMaxrate(Integer maxrate) {
        this.maxrate = maxrate;
    }

    @Basic
    @Column(name = "overridelimits")
    public Long getOverridelimits() {
        return overridelimits;
    }

    public void setOverridelimits(Long overridelimits) {
        this.overridelimits = overridelimits;
    }

    @Basic
    @Column(name = "maxbytes")
    public long getMaxbytes() {
        return maxbytes;
    }

    public void setMaxbytes(long maxbytes) {
        this.maxbytes = maxbytes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Configurations that = (Configurations) o;

        if (configId != that.configId) return false;
        if (domainId != that.domainId) return false;
        if (maxbytes != that.maxbytes) return false;
        if (maxobjects != that.maxobjects) return false;
        if (templateId != that.templateId) return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (maxrate != null ? !maxrate.equals(that.maxrate) : that.maxrate != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (overridelimits != null ? !overridelimits.equals(that.overridelimits) : that.overridelimits != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (configId ^ (configId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (int) (domainId ^ (domainId >>> 32));
        result = 31 * result + (int) (templateId ^ (templateId >>> 32));
        result = 31 * result + (int) (maxobjects ^ (maxobjects >>> 32));
        result = 31 * result + (maxrate != null ? maxrate.hashCode() : 0);
        result = 31 * result + (overridelimits != null ? overridelimits.hashCode() : 0);
        result = 31 * result + (int) (maxbytes ^ (maxbytes >>> 32));
        return result;
    }
}
