package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.Attachment;
import uz.pdp.appwarehousedatarest.projection.ProjectionAttachment;

@RepositoryRestResource(path = "attachment",excerptProjection = ProjectionAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
