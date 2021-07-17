package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.Measurement;
import uz.pdp.appwarehousedatarest.projection.ProjectionMeasurement;

@RepositoryRestResource(path = "measurement",excerptProjection = ProjectionMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {
    boolean existsByName(String name);
}
