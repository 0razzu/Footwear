package footwear.model;


import footwear.model.footwear_element.*;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
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
    public SixInchBoot copy() {
        Upper upper = getUpper();
        Tongue tongue = getTongue();
        Hardware hardware = getHardware();
        Laces laces = getLaces();
        Outsole outsole = getOutsole();
        
        return new SixInchBoot(
                collar == null? null : new Collar(collar.getMaterial(), collar.getColor()),
                upper == null? null : new Upper(upper.getColor(), upper.getMaterial()),
                tongue == null? null : new Tongue(tongue.getColor(), tongue.getMaterial()),
                hardware == null? null : new Hardware(hardware.getColor(), hardware.getType()),
                laces == null? null : new Laces(laces.getColor()),
                midsole == null? null : new Midsole(midsole.getColor()),
                outsole == null? null : new Outsole(outsole.getColor(), outsole.getType()),
                getSize()
        );
    }
    
    
    @Override
    public String toString() {
        return "SixInchBoot{" +
                "collar=" + collar +
                ", upper=" + getUpper() +
                ", tongue=" + getTongue() +
                ", hardware=" + getHardware() +
                ", laces=" + getLaces() +
                ", midsole=" + midsole +
                ", outsole=" + getOutsole() +
                ", size=" + getSize() +
                '}';
    }
}
