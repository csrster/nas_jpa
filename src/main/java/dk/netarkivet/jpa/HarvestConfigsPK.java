package dk.netarkivet.jpa;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by csr on 9/2/14.
 */
public class HarvestConfigsPK implements Serializable {
    private long harvestId;
    private long configId;

    @Column(name = "harvest_id")
    @Id
    public long getHarvestId() {
        return harvestId;
    }

    public void setHarvestId(long harvestId) {
        this.harvestId = harvestId;
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

        HarvestConfigsPK that = (HarvestConfigsPK) o;

        if (configId != that.configId) return false;
        if (harvestId != that.harvestId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (harvestId ^ (harvestId >>> 32));
        result = 31 * result + (int) (configId ^ (configId >>> 32));
        return result;
    }
}
