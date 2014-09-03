package dk.netarkivet.jpa;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by csr on 9/2/14.
 */
public class JobConfigsPK implements Serializable {
    private long jobId;
    private long configId;

    @Column(name = "job_id")
    @Id
    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    @Column(name = "config_id")
    @Id
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

        JobConfigsPK that = (JobConfigsPK) o;

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
