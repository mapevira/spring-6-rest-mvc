package guru.springframework.spring6restmvc.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

/**
 * Created by jt, Spring Framework Guru.
 * @author architecture - raulp
 * @since jdk 1.21
 * @version 09/09/2024 - 18:18
 */
@Data
@Builder
public class BeerOrderShipmentUpdateDTO {

    @NotBlank
    private String trackingNumber;

}
