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
@Table(name = "config_passwords", schema = "public", catalog = "netarchivesuite")
@IdClass(ConfigPasswordsPK.class)
public class ConfigPasswords {
    private long configId;
    private int passwordId;

    @Id
    @Column(name = "config_id")
    public long getConfigId() {
        return configId;
    }

    public void setConfigId(long configId) {
        this.configId = configId;
    }

    @Id
    @Column(name = "password_id")
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

        ConfigPasswords that = (ConfigPasswords) o;

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
