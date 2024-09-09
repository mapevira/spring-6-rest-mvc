package guru.springframework.spring6restmvc.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

/**
 * Created by jt, Spring Framework Guru.
 *
 * @author architecture - raulp
 * @version 09/09/2024 - 17:38
 * @since jdk 1.21
 */
@Data
@Builder
public class BeerOrderLineUpdateDTO {

    private UUID id;

    @NotNull
    private UUID beerId;

    @Min(value = 1, message = "Quantity On Hand must be greater than 0")
    private Integer orderQuantity;

    private Integer quantityAllocated;

}
