package footwear.builder;


import footwear.model.Sneaker;
import footwear.model.footwear_element.*;
import footwear.model.footwear_element.color.OutsoleColor;
import footwear.model.footwear_element.color.UpperColor;
import footwear.model.footwear_element.material.UpperMaterial;
import footwear.model.footwear_element.type.OutsoleType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Setter
@Getter
public class SneakerBuilder implements FootwearBuilder {
    private Upper upper;
    private Tongue tongue;
    private HeelText heelText;
    private Hardware hardware;
    private Laces laces;
    private Outsole outsole;
    private double size;
    
    
    @Override
    public SneakerBuilder withUpper(Upper upper) {
        setUpper(upper);
        return this;
    }
    
    
    @Override
    public SneakerBuilder withTongue(Tongue tongue) {
        setTongue(tongue);
        return this;
    }
    
    
    public SneakerBuilder withHeelText(HeelText heelText) {
        setHeelText(heelText);
        return this;
    }
    
    
    @Override
    public SneakerBuilder withHardware(Hardware hardware) {
        setHardware(hardware);
        return this;
    }
    
    
    @Override
    public SneakerBuilder withLaces(Laces laces) {
        setLaces(laces);
        return this;
    }
    
    
    @Override
    public SneakerBuilder withOutsole(Outsole outsole) {
        setOutsole(outsole);
        return this;
    }
    
    
    @Override
    public Sneaker build() {
        return new Sneaker(
                upper == null? new Upper(UpperColor.ALUMINIUM, UpperMaterial.MESH) : upper,
                tongue,
                heelText,
                hardware,
                laces,
                outsole == null? new Outsole(OutsoleColor.WHITE, OutsoleType.PROTECTED) : outsole,
                size
        );
    }
    
    
    @Override
    public void reset() {
        setUpper(null);
        setTongue(null);
        setHeelText(null);
        setHardware(null);
        setLaces(null);
        setOutsole(null);
        setSize(0);
    }
}
