package ro.amveri.packageorder.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Parcel {

    private final int boxNumber;
    private final String productCode;
    private final int colorCode;
    private final List<String> size;
    private final List<Integer> numberOfPcs;


}
