package dk.netarkivet.jpa;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by csr on 9/2/14.
 */
public class ConfigPasswordsPK implements Serializable {
    private long configId;
    private int passwordId;

    @Column(name = "config_id")
    @Id
    public long getConfigId() {
        return configId;
    }

    public void setConfigId(long configId) {
        this.configId = configId;
    }

    @Column(name = "password_id")
    @Id
    public int getPasswordId() {
        return passwordId;
    }

    public void setPasswordId(int passwordId) {
        this.passwordId = passwordId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfigPasswordsPK that = (ConfigPasswordsPK) o;

        if (configId != that.configId) return false;
        if (passwordId != that.passwordId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (configId ^ (configId >>> 32));
        result = 31 * result + passwordId;
        return result;
    }
}
