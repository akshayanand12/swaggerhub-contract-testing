package com.akshaya.swaggerhubcontracttesting.contracttest;

import com.akshaya.swaggerhubcontracttesting.ProductsController;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static com.atlassian.oai.validator.mockmvc.OpenApiValidationMatchers.openApi;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ProductAPIContractTest {
    public static final String SWAGGER_HUB_PRODUCTS_API_SPECS_URL = "http://localhost:8080/productsApiSpecs.json";

    @Test
    public void isValidProductListRequest() throws Exception {
        final ProductsController productsController = new ProductsController();
        final MockMvc mockMvc = MockMvcBuilders.standaloneSetup(productsController).build();
        mockMvc
                .perform(get("/products"))
                .andExpect(status().isOk())
                .andExpect(openApi().isValid(SWAGGER_HUB_PRODUCTS_API_SPECS_URL));
    }
}
