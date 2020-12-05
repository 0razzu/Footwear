package footwear.model;


import footwear.model.footwear_element.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SixInchBoot extends Footwear {
    private Collar collar;
    private Midsole midsole;
    
    
    public SixInchBoot(Collar collar, Upper upper, Tongue tongue, Hardware hardware, Laces laces,
                       Midsole midsole, Outsole outsole, double size) {
        super(upper, tongue, hardware, laces, outsole, size);
        setCollar(collar);
        setMidsole(midsole);
    }
    
    
    @Override
    public Footwear copy() {
        return new SixInchBoot(
                new Collar(collar.getMaterial(), collar.getColor()),
                new Upper(getUpper().getColor(), getUpper().getMaterial()),
                new Tongue(getTongue().getColor(), getTongue().getMaterial()),
                new Hardware(getHardware().getColor(), getHardware().getType()),
                new Laces(getLaces().getColor()),
                new Midsole(midsole.getColor()),
                new Outsole(getOutsole().getColor(), getOutsole().getType()),
                getSize()
        );
    }
}
