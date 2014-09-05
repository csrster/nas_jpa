package dk.netarkivet.jpa.dao;


import dk.netarkivet.jpa.ConfigPasswords;
import dk.netarkivet.dao.ConfigPasswordsDao;
import dk.netarkivet.jpa.ConfigPasswordsPK;
import dk.netarkivet.Main;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = Main.class)
public class ConfigPasswordsDaoTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void doCreate() {
        ConfigPasswordsDao dao = context.getBean(ConfigPasswordsDao.class);
        ConfigPasswords configPasswords = new ConfigPasswords();
        configPasswords.setConfigId(5432L);
        configPasswords.setPasswordId(1223);
        ConfigPasswordsPK pk = new ConfigPasswordsPK();
        pk.setConfigId(configPasswords.getConfigId());
        pk.setPasswordId(configPasswords.getPasswordId());
        if (dao.exists(pk)) {
            dao.delete(pk);
        }
        assertFalse(dao.exists(pk));
        dao.save(configPasswords);
        assertTrue(dao.exists(pk));
    }

}
