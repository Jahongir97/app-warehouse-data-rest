package uz.pdp.appwarehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Client;
import uz.pdp.appwarehousedatarest.entity.Currency;
import uz.pdp.appwarehousedatarest.entity.Output;
import uz.pdp.appwarehousedatarest.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface ProjectionOutput {
    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouse();

    Client getClient();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
