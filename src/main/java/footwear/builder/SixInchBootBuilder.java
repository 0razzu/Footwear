package footwear.builder;


import footwear.model.SixInchBoot;
import footwear.model.footwear_element.*;
import footwear.model.footwear_element.color.*;
import footwear.model.footwear_element.material.TongueMaterial;
import footwear.model.footwear_element.material.UpperMaterial;
import footwear.model.footwear_element.type.HardwareType;
import footwear.model.footwear_element.type.OutsoleType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Setter
@Getter
public class SixInchBootBuilder implements FootwearBuilder {
    private Collar collar;
    private Upper upper;
    private Tongue tongue;
    private Hardware hardware;
    private Laces laces;
    private Midsole midsole;
    private Outsole outsole;
    private double size;
    
    
    public SixInchBootBuilder withCollar(Collar collar) {
        setCollar(collar);
        return this;
    }
    
    
    @Override
    public SixInchBootBuilder withUpper(Upper upper) {
        setUpper(upper);
        return this;
    }
    
    
    @Override
    public SixInchBootBuilder withTongue(Tongue tongue) {
        setTongue(tongue);
        return this;
    }
    
    
    @Override
    public SixInchBootBuilder withHardware(Hardware hardware) {
        setHardware(hardware);
        return this;
    }
    
    
    @Override
    public SixInchBootBuilder withLaces(Laces laces) {
        setLaces(laces);
        return this;
    }
    
    
    public SixInchBootBuilder withMidsole(Midsole midsole) {
        setMidsole(midsole);
        return this;
    }
    
    
    @Override
    public SixInchBootBuilder withOutsole(Outsole outsole) {
        setOutsole(outsole);
        return this;
    }
    
    
    @Override
    public SixInchBoot build() {
        return new SixInchBoot(
                collar,
                upper == null? new Upper(UpperColor.WHEAT, UpperMaterial.NUBUCK) : upper,
                tongue == null? new Tongue(TongueColor.WHEAT, TongueMaterial.ECO_LEATHER) : tongue,
                hardware == null? new Hardware(HardwareColor.SILVER, HardwareType.CIRCLE) : hardware,
                laces == null? new Laces(LacesColor.CINNAMON) : laces,
                midsole,
                outsole == null? new Outsole(OutsoleColor.CINNAMON, OutsoleType.PROTECTED) : outsole,
                size
        );
    }
    
    
    @Override
    public void reset() {
        setCollar(null);
        setUpper(null);
        setTongue(null);
        setHardware(null);
        setLaces(null);
        setMidsole(null);
        setOutsole(null);
        setSize(0);
    }
}
