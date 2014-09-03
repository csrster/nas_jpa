package dk.netarkivet.jpa;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by csr on 9/2/14.
 */
public class ConfigSeedlistsPK implements Serializable {
    private long configId;
    private int seedlistId;

    @Column(name = "config_id")
    @Id
    public long getConfigId() {
        return configId;
    }

    public void setConfigId(long configId) {
        this.configId = configId;
    }

    @Column(name = "seedlist_id")
    @Id
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

        ConfigSeedlistsPK that = (ConfigSeedlistsPK) o;

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
