package uz.pdp.appwarehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Supplier;

@Projection(types = Supplier.class)

public interface ProjectionSupplier {
    Integer getId();

    String getName();

    Boolean getActive();

    String getPhoneNumber();
}
