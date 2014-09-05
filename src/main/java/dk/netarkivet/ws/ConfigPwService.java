package dk.netarkivet.ws;

import dk.netarkivet.dao.ConfigPasswordsDao;
import dk.netarkivet.jpa.ConfigPasswords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class ConfigPwService {

    @Autowired
    ApplicationContext context;


    public Iterable<ConfigPasswords> getConfigPasswords() {
         return context.getBean(ConfigPasswordsDao.class).findAll();
    }

}
