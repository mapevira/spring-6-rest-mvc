package guru.springframework.spring6restmvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jt, Spring Framework Guru.
 *
 * @author architecture - raulp
 * @version 08/09/2024 - 20:11
 * @since jdk 1.21
 */
@RestController
@Slf4j
public class BeerOrderController {

    public static final String BEER_ORDER_PATH = "/api/v1/beerorder";
    public static final String BEER_ORDER_PATH_ID = BEER_ORDER_PATH + "/{beerOrderId}";

}
