package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.User;
import uz.pdp.appwarehousedatarest.projection.ProjectionUser;

@RepositoryRestResource(path = "user",excerptProjection = ProjectionUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {
}
