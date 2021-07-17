package uz.pdp.appwarehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehousedatarest.entity.Attachment;

@Projection(types = Attachment.class)
public interface ProjectionAttachment {
    Integer getId();

    String getName();

    Long getSize();

    String getContentType();
}
