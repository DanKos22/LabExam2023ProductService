package ie.atu.labexamnov2023;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {


    ArrayList<String> myList = new ArrayList<>();
    public String addProduct(Product product){
        String object = "Product" + product.getProductId() + product.getProductName() + "added";
        myList.add(object);
    }

    public String getProductById(){

    }
}
