package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.Supplier;
import uz.pdp.appwarehousedatarest.projection.ProjectionSupplier;

@RepositoryRestResource(path = "supplier",excerptProjection = ProjectionSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
