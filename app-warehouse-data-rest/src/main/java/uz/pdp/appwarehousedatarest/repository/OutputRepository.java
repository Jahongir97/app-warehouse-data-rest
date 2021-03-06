package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.Output;
import uz.pdp.appwarehousedatarest.projection.ProjectionOutput;

@RepositoryRestResource(path = "output",excerptProjection = ProjectionOutput.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {
}
