package guru.springframework.spring6restmvc.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

/**
 * Created by jt, Spring Framework Guru.
 *
 * @author architecture - raulp
 * @version 09/09/2024 - 13:03
 * @since jdk 1.21
 */
public class BeerOrderLineCreateDTO {

    @NotNull
    private UUID beerId;

    @Min(value = 1, message = "Quantity On Hand must be greater than 0")
    private Integer orderQuantity;

}
