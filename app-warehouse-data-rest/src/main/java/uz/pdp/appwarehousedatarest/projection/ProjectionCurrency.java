package uz.pdp.appwarehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Currency;

@Projection(types = Currency.class)
public interface ProjectionCurrency {
    Integer getId();

    String getName();

    Boolean getActive();

}
