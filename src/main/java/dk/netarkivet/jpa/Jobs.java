package dk.netarkivet.jpa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by csr on 9/2/14.
 */
@Entity
public class Jobs {
    private long jobId;

    @Id
    @javax.persistence.Column(name = "job_id")
    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    private long harvestId;

    @Basic
    @javax.persistence.Column(name = "harvest_id")
    public long getHarvestId() {
        return harvestId;
    }

    public void setHarvestId(long harvestId) {
        this.harvestId = harvestId;
    }

    private int status;

    @Basic
    @javax.persistence.Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    private int priority;

    @Basic
    @javax.persistence.Column(name = "priority")
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    private long forcemaxbytes;

    @Basic
    @javax.persistence.Column(name = "forcemaxbytes")
    public long getForcemaxbytes() {
        return forcemaxbytes;
    }

    public void setForcemaxbytes(long forcemaxbytes) {
        this.forcemaxbytes = forcemaxbytes;
    }

    private Long forcemaxcount;

    @Basic
    @javax.persistence.Column(name = "forcemaxcount")
    public Long getForcemaxcount() {
        return forcemaxcount;
    }

    public void setForcemaxcount(Long forcemaxcount) {
        this.forcemaxcount = forcemaxcount;
    }

    private String orderxml;

    @Basic
    @javax.persistence.Column(name = "orderxml")
    public String getOrderxml() {
        return orderxml;
    }

    public void setOrderxml(String orderxml) {
        this.orderxml = orderxml;
    }

    private String orderxmldoc;

    @Basic
    @javax.persistence.Column(name = "orderxmldoc")
    public String getOrderxmldoc() {
        return orderxmldoc;
    }

    public void setOrderxmldoc(String orderxmldoc) {
        this.orderxmldoc = orderxmldoc;
    }

    private String seedlist;

    @Basic
    @javax.persistence.Column(name = "seedlist")
    public String getSeedlist() {
        return seedlist;
    }

    public void setSeedlist(String seedlist) {
        this.seedlist = seedlist;
    }

    private int harvestNum;

    @Basic
    @javax.persistence.Column(name = "harvest_num")
    public int getHarvestNum() {
        return harvestNum;
    }

    public void setHarvestNum(int harvestNum) {
        this.harvestNum = harvestNum;
    }

    private String harvestErrors;

    @Basic
    @javax.persistence.Column(name = "harvest_errors")
    public String getHarvestErrors() {
        return harvestErrors;
    }

    public void setHarvestErrors(String harvestErrors) {
        this.harvestErrors = harvestErrors;
    }

    private String harvestErrorDetails;

    @Basic
    @javax.persistence.Column(name = "harvest_error_details")
    public String getHarvestErrorDetails() {
        return harvestErrorDetails;
    }

    public void setHarvestErrorDetails(String harvestErrorDetails) {
        this.harvestErrorDetails = harvestErrorDetails;
    }

    private String uploadErrors;

    @Basic
    @javax.persistence.Column(name = "upload_errors")
    public String getUploadErrors() {
        return uploadErrors;
    }

    public void setUploadErrors(String uploadErrors) {
        this.uploadErrors = uploadErrors;
    }

    private String uploadErrorDetails;

    @Basic
    @javax.persistence.Column(name = "upload_error_details")
    public String getUploadErrorDetails() {
        return uploadErrorDetails;
    }

    public void setUploadErrorDetails(String uploadErrorDetails) {
        this.uploadErrorDetails = uploadErrorDetails;
    }

    private Timestamp startdate;

    @Basic
    @javax.persistence.Column(name = "startdate")
    public Timestamp getStartdate() {
        return startdate;
    }

    public void setStartdate(Timestamp startdate) {
        this.startdate = startdate;
    }

    private Timestamp enddate;

    @Basic
    @javax.persistence.Column(name = "enddate")
    public Timestamp getEnddate() {
        return enddate;
    }

    public void setEnddate(Timestamp enddate) {
        this.enddate = enddate;
    }

    private int numConfigs;

    @Basic
    @javax.persistence.Column(name = "num_configs")
    public int getNumConfigs() {
        return numConfigs;
    }

    public void setNumConfigs(int numConfigs) {
        this.numConfigs = numConfigs;
    }

    private long edition;

    @Basic
    @javax.persistence.Column(name = "edition")
    public long getEdition() {
        return edition;
    }

    public void setEdition(long edition) {
        this.edition = edition;
    }

    private Timestamp submitteddate;

    @Basic
    @javax.persistence.Column(name = "submitteddate")
    public Timestamp getSubmitteddate() {
        return submitteddate;
    }

    public void setSubmitteddate(Timestamp submitteddate) {
        this.submitteddate = submitteddate;
    }

    private Timestamp creationdate;

    @Basic
    @javax.persistence.Column(name = "creationdate")
    public Timestamp getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Timestamp creationdate) {
        this.creationdate = creationdate;
    }

    private Long resubmittedAsJob;

    @Basic
    @javax.persistence.Column(name = "resubmitted_as_job")
    public Long getResubmittedAsJob() {
        return resubmittedAsJob;
    }

    public void setResubmittedAsJob(Long resubmittedAsJob) {
        this.resubmittedAsJob = resubmittedAsJob;
    }

    private Long continuationof;

    @Basic
    @javax.persistence.Column(name = "continuationof")
    public Long getContinuationof() {
        return continuationof;
    }

    public void setContinuationof(Long continuationof) {
        this.continuationof = continuationof;
    }

    private long forcemaxrunningtime;

    @Basic
    @javax.persistence.Column(name = "forcemaxrunningtime")
    public long getForcemaxrunningtime() {
        return forcemaxrunningtime;
    }

    public void setForcemaxrunningtime(long forcemaxrunningtime) {
        this.forcemaxrunningtime = forcemaxrunningtime;
    }

    private String harvestnamePrefix;

    @Basic
    @javax.persistence.Column(name = "harvestname_prefix")
    public String getHarvestnamePrefix() {
        return harvestnamePrefix;
    }

    public void setHarvestnamePrefix(String harvestnamePrefix) {
        this.harvestnamePrefix = harvestnamePrefix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jobs jobs = (Jobs) o;

        if (edition != jobs.edition) return false;
        if (forcemaxbytes != jobs.forcemaxbytes) return false;
        if (forcemaxrunningtime != jobs.forcemaxrunningtime) return false;
        if (harvestId != jobs.harvestId) return false;
        if (harvestNum != jobs.harvestNum) return false;
        if (jobId != jobs.jobId) return false;
        if (numConfigs != jobs.numConfigs) return false;
        if (priority != jobs.priority) return false;
        if (status != jobs.status) return false;
        if (continuationof != null ? !continuationof.equals(jobs.continuationof) : jobs.continuationof != null)
            return false;
        if (creationdate != null ? !creationdate.equals(jobs.creationdate) : jobs.creationdate != null) return false;
        if (enddate != null ? !enddate.equals(jobs.enddate) : jobs.enddate != null) return false;
        if (forcemaxcount != null ? !forcemaxcount.equals(jobs.forcemaxcount) : jobs.forcemaxcount != null)
            return false;
        if (harvestErrorDetails != null ? !harvestErrorDetails.equals(jobs.harvestErrorDetails) : jobs.harvestErrorDetails != null)
            return false;
        if (harvestErrors != null ? !harvestErrors.equals(jobs.harvestErrors) : jobs.harvestErrors != null)
            return false;
        if (harvestnamePrefix != null ? !harvestnamePrefix.equals(jobs.harvestnamePrefix) : jobs.harvestnamePrefix != null)
            return false;
        if (orderxml != null ? !orderxml.equals(jobs.orderxml) : jobs.orderxml != null) return false;
        if (orderxmldoc != null ? !orderxmldoc.equals(jobs.orderxmldoc) : jobs.orderxmldoc != null) return false;
        if (resubmittedAsJob != null ? !resubmittedAsJob.equals(jobs.resubmittedAsJob) : jobs.resubmittedAsJob != null)
            return false;
        if (seedlist != null ? !seedlist.equals(jobs.seedlist) : jobs.seedlist != null) return false;
        if (startdate != null ? !startdate.equals(jobs.startdate) : jobs.startdate != null) return false;
        if (submitteddate != null ? !submitteddate.equals(jobs.submitteddate) : jobs.submitteddate != null)
            return false;
        if (uploadErrorDetails != null ? !uploadErrorDetails.equals(jobs.uploadErrorDetails) : jobs.uploadErrorDetails != null)
            return false;
        if (uploadErrors != null ? !uploadErrors.equals(jobs.uploadErrors) : jobs.uploadErrors != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (jobId ^ (jobId >>> 32));
        result = 31 * result + (int) (harvestId ^ (harvestId >>> 32));
        result = 31 * result + status;
        result = 31 * result + priority;
        result = 31 * result + (int) (forcemaxbytes ^ (forcemaxbytes >>> 32));
        result = 31 * result + (forcemaxcount != null ? forcemaxcount.hashCode() : 0);
        result = 31 * result + (orderxml != null ? orderxml.hashCode() : 0);
        result = 31 * result + (orderxmldoc != null ? orderxmldoc.hashCode() : 0);
        result = 31 * result + (seedlist != null ? seedlist.hashCode() : 0);
        result = 31 * result + harvestNum;
        result = 31 * result + (harvestErrors != null ? harvestErrors.hashCode() : 0);
        result = 31 * result + (harvestErrorDetails != null ? harvestErrorDetails.hashCode() : 0);
        result = 31 * result + (uploadErrors != null ? uploadErrors.hashCode() : 0);
        result = 31 * result + (uploadErrorDetails != null ? uploadErrorDetails.hashCode() : 0);
        result = 31 * result + (startdate != null ? startdate.hashCode() : 0);
        result = 31 * result + (enddate != null ? enddate.hashCode() : 0);
        result = 31 * result + numConfigs;
        result = 31 * result + (int) (edition ^ (edition >>> 32));
        result = 31 * result + (submitteddate != null ? submitteddate.hashCode() : 0);
        result = 31 * result + (creationdate != null ? creationdate.hashCode() : 0);
        result = 31 * result + (resubmittedAsJob != null ? resubmittedAsJob.hashCode() : 0);
        result = 31 * result + (continuationof != null ? continuationof.hashCode() : 0);
        result = 31 * result + (int) (forcemaxrunningtime ^ (forcemaxrunningtime >>> 32));
        result = 31 * result + (harvestnamePrefix != null ? harvestnamePrefix.hashCode() : 0);
        return result;
    }
}
