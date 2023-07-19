package ro.amveri.packageorder.model;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Product {
    String name;
    String colour;

    public Product(String name, String colour){
        this.name=name;
        this.colour=colour;

    }
}
