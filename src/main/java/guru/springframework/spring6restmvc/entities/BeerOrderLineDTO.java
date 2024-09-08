package guru.springframework.spring6restmvc.entities;

import guru.springframework.spring6restmvc.model.BeerDTO;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by jt, Spring Framework Guru.
 *
 * @author architecture - raulp
 * @version 08/09/2024 - 17:57
 * @since jdk 1.21
 */
@Builder
@Data
public class BeerOrderLineDTO {

    private UUID id;

    private Long version;
    private Timestamp createdDate;

    private Timestamp lastModifiedDate;

    private BeerDTO beer;

    private Integer orderQuantity;
    private Integer quantityAllocated;

}
