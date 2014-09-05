package dk.netarkivet.dao;

import dk.netarkivet.jpa.ConfigPasswords;
import dk.netarkivet.jpa.ConfigPasswordsPK;
import org.springframework.data.repository.CrudRepository;

public interface ConfigPasswordsDao extends CrudRepository<ConfigPasswords, ConfigPasswordsPK> {
}
