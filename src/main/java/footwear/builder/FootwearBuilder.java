package footwear.builder;


import footwear.model.footwear_element.*;


public interface FootwearBuilder {
    void setCollar(Collar collar);
    void setUpper(Upper upper);
    void setTongue(Tongue tongue);
    void setHardware(Hardware hardware);
    void setLaces(Laces laces);
    void setMidsole(Midsole midsole);
    void setOutsole(Outsole outsole);
    
    FootwearBuilder withCollar(Collar collar);
    FootwearBuilder withUpper(Upper upper);
    FootwearBuilder withTongue(Tongue tongue);
    FootwearBuilder withHardware(Hardware hardware);
    FootwearBuilder withLaces(Laces laces);
    FootwearBuilder withMidsole(Midsole midsole);
    FootwearBuilder withOutsole(Outsole outsole);
    
    void reset();
}
