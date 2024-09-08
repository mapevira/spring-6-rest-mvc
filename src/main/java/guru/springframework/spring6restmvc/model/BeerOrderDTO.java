package guru.springframework.spring6restmvc.model;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

/**
 * Created by jt, Spring Framework Guru.
 *
 * @author architecture - raulp
 * @version 08/09/2024 - 17:52
 * @since jdk 1.21
 */
@Builder
@Data
public class BeerOrderDTO {

    private UUID id;
    private Long version;
    private Timestamp createdDate;
    private Timestamp lastModifiedDate;

    private String customerRef;

    private CustomerDTO customer;

    private Set<BeerOrderLineDTO> beerOrderLines;

    private BeerOrderShipmentDTO beerOrderShipment;

}
