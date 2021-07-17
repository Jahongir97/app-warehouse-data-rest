package uz.pdp.appwarehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.*;

@Projection(types = Product.class)
public interface ProjectionProduct {
    Integer getId();

    String getName();

    Boolean getActive();

    Category getCategory();

    Attachment getPhoto();

    String getCode();

    Measurement getMeasurement();

}
