package guru.springframework.spring6restmvc.entities;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by jt, Spring Framework Guru.
 *
 * @author architecture - raulp
 * @version 08/09/2024 - 18:00
 * @since jdk 1.21
 */
@Builder
@Data
public class BeerOrderShipmentDTO {

    private UUID id;

    private Long version;

    private String trackingNumber;

    private Timestamp createdDate;
    private Timestamp lastModifiedDate;

}
