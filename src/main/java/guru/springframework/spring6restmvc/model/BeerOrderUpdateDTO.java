package guru.springframework.spring6restmvc.model;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

/**
 * Created by jt, Spring Framework Guru.
 *
 * @author architecture - raulp
 * @version 09/09/2024 - 18:16
 * @since jdk 1.21
 */
@Data
@Builder
public class BeerOrderUpdateDTO {

    private String customerRef;

    private Set<BeerOrderLineDTO> beerOrderLines;

    private BeerOrderShipmentUpdateDTO beerOrderShipment;

}
