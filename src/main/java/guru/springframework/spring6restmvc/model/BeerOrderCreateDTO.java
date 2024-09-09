package guru.springframework.spring6restmvc.model;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

/**
 * Created by jt, Spring Framework Guru.
 *
 * @author architecture - raulp
 * @version 09/09/2024 - 13:02
 * @since jdk 1.21
 */
@Data
@Builder
public class BeerOrderCreateDTO {

    private String customerRef;

    @NotNull
    private UUID customerId;

    private Set<BeerOrderLineCreateDTO> beerOrderLines;

}
