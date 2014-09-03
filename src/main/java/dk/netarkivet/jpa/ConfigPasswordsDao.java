package dk.netarkivet.jpa;

import dk.netarkivet.jpa.ConfigPasswords;
import dk.netarkivet.jpa.ConfigPasswordsPK;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by csr on 03/09/14.
 */
public interface ConfigPasswordsDao extends CrudRepository<ConfigPasswords, ConfigPasswordsPK> {
}
