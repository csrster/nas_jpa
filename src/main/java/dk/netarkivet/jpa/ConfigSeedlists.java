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
@Table(name = "config_seedlists", schema = "public", catalog = "netarchivesuite")
@IdClass(ConfigSeedlistsPK.class)
public class ConfigSeedlists {
    private long configId;
    private int seedlistId;

    @Id
    @Column(name = "config_id")
    public long getConfigId() {
        return configId;
    }

    public void setConfigId(long configId) {
        this.configId = configId;
    }

    @Id
    @Column(name = "seedlist_id")
    public int getSeedlistId() {
        return seedlistId;
    }

    public void setSeedlistId(int seedlistId) {
        this.seedlistId = seedlistId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfigSeedlists that = (ConfigSeedlists) o;

        if (configId != that.configId) return false;
        if (seedlistId != that.seedlistId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (configId ^ (configId >>> 32));
        result = 31 * result + seedlistId;
        return result;
    }
}
