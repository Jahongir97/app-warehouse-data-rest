package uz.pdp.appwarehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface ProjectionWarehouse {
    Integer getId();

    String getName();

    Boolean getActive();
}
