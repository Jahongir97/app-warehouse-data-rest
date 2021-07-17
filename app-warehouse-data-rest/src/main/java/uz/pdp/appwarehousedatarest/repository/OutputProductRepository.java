package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.OutputProduct;
import uz.pdp.appwarehousedatarest.projection.ProjectionOutputProduct;

@RepositoryRestResource(path = "outputProduct",excerptProjection = ProjectionOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
