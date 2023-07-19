package ro.amveri.packageorder.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.amveri.packageorder.model.Product;

@RestController
@RequestMapping(value = "/package")
public class PackageController {

    @PostMapping()
    public ResponseEntity<Product> processPackages(@RequestBody Product product) {
        return ResponseEntity.ok(product);
    }
}
