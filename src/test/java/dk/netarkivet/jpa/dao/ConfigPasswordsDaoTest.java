package dk.netarkivet.jpa.dao;


import dk.netarkivet.jpa.ConfigPasswords;
import dk.netarkivet.jpa.ConfigPasswordsDao;
import dk.netarkivet.jpa.Main;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by csr on 03/09/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = Main.class)
public class ConfigPasswordsDaoTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void doCreate() {
        ConfigPasswords configPasswords = new ConfigPasswords();
        configPasswords.setConfigId(5432L);
        configPasswords.setPasswordId(1223);
        ConfigPasswordsDao dao = context.getBean(ConfigPasswordsDao.class);
        dao.save(configPasswords);

    }

}
