package footwear.model;


import footwear.model.footwear_element.*;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Footwear implements Prototype<Footwear> {
    private Collar collar;
    private Upper upper;
    private Tongue tongue;
    private Hardware hardware;
    private Laces laces;
    private Midsole midsole;
    private Outsole outsole;
    
    
    @Override
    public Footwear copy() {
        return new Footwear(
                new Collar(collar.getMaterial(), collar.getColor()),
                new Upper(upper.getColor(), upper.getMaterial()),
                new Tongue(tongue.getColor(), tongue.getMaterial()),
                new Hardware(hardware.getColor(), hardware.getType()),
                new Laces(laces.getColor()),
                new Midsole(midsole.getColor()),
                new Outsole(outsole.getColor(), outsole.getType())
        );
    }
}
