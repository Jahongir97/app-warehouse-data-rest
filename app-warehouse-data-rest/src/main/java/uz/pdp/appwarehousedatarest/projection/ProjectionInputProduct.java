package uz.pdp.appwarehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Input;
import uz.pdp.appwarehousedatarest.entity.InputProduct;
import uz.pdp.appwarehousedatarest.entity.Product;

import java.time.LocalDate;

@Projection(types = InputProduct.class)
public interface ProjectionInputProduct {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    LocalDate getExpireDate();

    Input getInput();
}
