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
@Table(name = "harvest_configs", schema = "public", catalog = "netarchivesuite")
@IdClass(HarvestConfigsPK.class)
public class HarvestConfigs {
    private long harvestId;
    private long configId;

    @Id
    @Column(name = "harvest_id")
    public long getHarvestId() {
        return harvestId;
    }

    public void setHarvestId(long harvestId) {
        this.harvestId = harvestId;
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

        HarvestConfigs that = (HarvestConfigs) o;

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
