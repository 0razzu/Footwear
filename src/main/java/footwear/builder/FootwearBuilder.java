package footwear.builder;


import footwear.model.Footwear;
import footwear.model.footwear_element.*;


public interface FootwearBuilder {
    void setUpper(Upper upper);
    void setTongue(Tongue tongue);
    void setHardware(Hardware hardware);
    void setLaces(Laces laces);
    void setOutsole(Outsole outsole);
    
    FootwearBuilder withUpper(Upper upper);
    FootwearBuilder withTongue(Tongue tongue);
    FootwearBuilder withHardware(Hardware hardware);
    FootwearBuilder withLaces(Laces laces);
    FootwearBuilder withOutsole(Outsole outsole);
    
    Upper getUpper();
    Tongue getTongue();
    Hardware getHardware();
    Laces getLaces();
    Outsole getOutsole();
    
    Footwear build();
    void reset();
}
