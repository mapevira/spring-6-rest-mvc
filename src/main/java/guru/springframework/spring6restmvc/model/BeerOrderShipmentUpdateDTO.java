package guru.springframework.spring6restmvc.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jt, Spring Framework Guru.
 * @author architecture - raulp
 * @since jdk 1.21
 * @version 09/09/2024 - 18:18
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BeerOrderShipmentUpdateDTO {

    @NotBlank
    private String trackingNumber;

}
