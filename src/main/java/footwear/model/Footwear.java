package footwear.model;


import footwear.model.footwear_element.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Footwear {
    private Upper upper;
    private Tongue tongue;
    private Hardware hardware;
    private Laces laces;
    private Outsole outsole;
    private double size;
    
    
    public abstract Footwear copy();
}
