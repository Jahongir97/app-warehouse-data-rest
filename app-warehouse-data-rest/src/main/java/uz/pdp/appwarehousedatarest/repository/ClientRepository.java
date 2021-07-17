package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.Client;
import uz.pdp.appwarehousedatarest.projection.ProjectionClient;

@RepositoryRestResource(path = "client",excerptProjection = ProjectionClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
