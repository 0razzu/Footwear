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
    public Footwear copy() {
        return new Sneaker(
                new Upper(getUpper().getColor(), getUpper().getMaterial()),
                new Tongue(getTongue().getColor(), getTongue().getMaterial()),
                new HeelText(heelText.getText(), heelText.getColor()),
                new Hardware(getHardware().getColor(), getHardware().getType()),
                new Laces(getLaces().getColor()),
                new Outsole(getOutsole().getColor(), getOutsole().getType()),
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
