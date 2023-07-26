package ro.amveri.packageorder.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ProductDetails {
    private final String size;
    private final int numberOfPieces;
}
