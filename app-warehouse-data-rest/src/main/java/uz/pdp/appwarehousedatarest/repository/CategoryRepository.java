package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.Category;
import uz.pdp.appwarehousedatarest.projection.ProjectionCategory;

@RepositoryRestResource(path = "category",excerptProjection = ProjectionCategory.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
