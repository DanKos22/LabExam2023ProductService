package ie.atu.labexamnov2023;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "product", url = "https://localhost: 8081")
public interface WarehouseServiceClient {
    @PostMapping("/warehouse")
    String someDetails(@RequestBody Product product);
}
