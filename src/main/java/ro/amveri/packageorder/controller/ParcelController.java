package ro.amveri.packageorder.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.amveri.packageorder.model.Parcel;
import ro.amveri.packageorder.model.ProductDetails;

@RestController
@RequestMapping(value = "/parcels")
public class ParcelController {

    @PostMapping()
    public ResponseEntity<Parcel> processParcels(@RequestBody Parcel parcel) {
        for (ProductDetails details : parcel.getDetails()) {
        }
        return ResponseEntity.ok(parcel);
    }
}
