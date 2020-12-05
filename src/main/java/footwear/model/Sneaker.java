package footwear.model;


import footwear.model.footwear_element.*;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class Sneaker extends Footwear {
    private HeelText heelText;
    
    
    public Sneaker(Upper upper, Tongue tongue, HeelText heelText, Hardware hardware, Laces laces, Outsole outsole, double size) {
        super(upper, tongue, hardware, laces, outsole, size);
        setHeelText(heelText);
    }
    
    
    @Override
    public Sneaker copy() {
        Upper upper = getUpper();
        Tongue tongue = getTongue();
        Hardware hardware = getHardware();
        Laces laces = getLaces();
        Outsole outsole = getOutsole();
        
        return new Sneaker(
                upper == null? null : new Upper(upper.getColor(), upper.getMaterial()),
                tongue == null? null : new Tongue(tongue.getColor(), tongue.getMaterial()),
                heelText == null? null : new HeelText(heelText.getText(), heelText.getColor()),
                hardware == null? null : new Hardware(hardware.getColor(), hardware.getType()),
                laces == null? null : new Laces(laces.getColor()),
                outsole == null? null : new Outsole(outsole.getColor(), outsole.getType()),
                getSize()
        );
    }
    
    
    @Override
    public String toString() {
        return "Sneaker{" +
                "upper=" + getUpper() +
                ", tongue=" + getTongue() +
                ", heelText=" + heelText +
                ", hardware=" + getHardware() +
                ", laces=" + getLaces() +
                ", outsole=" + getOutsole() +
                ", size=" + getSize() +
                '}';
    }
}
