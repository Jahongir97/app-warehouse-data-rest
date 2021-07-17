package uz.pdp.appwarehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehousedatarest.entity.AttachmentContent;
import uz.pdp.appwarehousedatarest.projection.ProjectionAttachmentContent;

@RepositoryRestResource(path = "attachmentContent",excerptProjection = ProjectionAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {

}
