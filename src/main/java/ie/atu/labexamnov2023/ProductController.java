package ie.atu.labexamnov2023;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private WarehouseServiceClient warehouseServiceClient;

    @Autowired
    public ProductController(WarehouseServiceClient warehouseServiceClient){
        this.warehouseServiceClient = warehouseServiceClient;
    }

    @PostMapping("/product")
        public String getProduct(@RequestBody Product product){
            String message = warehouseServiceClient.someDetails(product);
            return message;
        }
}
