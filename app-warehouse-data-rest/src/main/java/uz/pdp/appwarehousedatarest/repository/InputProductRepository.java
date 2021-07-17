package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.InputProduct;
import uz.pdp.appwarehousedatarest.projection.ProjectionInputProduct;


@RepositoryRestResource(path = "inputProduct",excerptProjection = ProjectionInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {

}
