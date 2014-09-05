package dk.netarkivet.ws;

import dk.netarkivet.jpa.ConfigPasswords;
import javax.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@Path("/config")
public class ConfigRestService {

    @Inject private ConfigPwService configService;

    @Produces( { "application/json" } )
    @GET
    public Collection<ConfigPasswords> getConfigPasswords() {
        Collection<ConfigPasswords> configPasswords = new ArrayList<>();
        final Iterator<ConfigPasswords> iterator = configService.getConfigPasswords().iterator();
        while ( iterator.hasNext()) {
            configPasswords.add(iterator.next());
        }
        return configPasswords;
    }

}
