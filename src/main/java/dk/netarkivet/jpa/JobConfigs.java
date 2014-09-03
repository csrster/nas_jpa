package dk.netarkivet.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * Created by csr on 9/2/14.
 */
@Entity
@Table(name = "job_configs", schema = "public", catalog = "netarchivesuite")
@IdClass(JobConfigsPK.class)
public class JobConfigs {
    private long jobId;
    private long configId;

    @Id
    @Column(name = "job_id")
    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    @Id
    @Column(name = "config_id")
    public long getConfigId() {
        return configId;
    }

    public void setConfigId(long configId) {
        this.configId = configId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobConfigs that = (JobConfigs) o;

        if (configId != that.configId) return false;
        if (jobId != that.jobId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (jobId ^ (jobId >>> 32));
        result = 31 * result + (int) (configId ^ (configId >>> 32));
        return result;
    }
}
