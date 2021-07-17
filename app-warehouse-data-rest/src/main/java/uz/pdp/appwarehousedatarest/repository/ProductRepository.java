package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.Product;
import uz.pdp.appwarehousedatarest.projection.ProjectionProduct;

@RepositoryRestResource(path = "product",excerptProjection = ProjectionProduct.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
