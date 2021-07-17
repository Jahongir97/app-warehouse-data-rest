package uz.pdp.appwarehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Client;

@Projection(types = Client.class)
public interface ProjectionClient {
    Integer getId();

    String getName();

    Boolean getActive();

    String getPhoneNumber();

}
