package footwear;


import footwear.builder.FootwearBuilder;
import footwear.builder.SixInchBootBuilder;
import footwear.builder.SneakerBuilder;
import footwear.model.Footwear;
import footwear.model.SixInchBoot;
import footwear.model.footwear_element.*;
import footwear.model.footwear_element.color.*;
import footwear.model.footwear_element.material.TongueMaterial;
import footwear.model.footwear_element.type.HardwareType;


public class FootwearDemo {
    public static void main(String[] args) {
        FootwearBuilder builder1 = new SneakerBuilder();
        builder1.setLaces(new Laces(LacesColor.BLACK));
        builder1.setHardware(new Hardware(HardwareColor.SILVER, HardwareType.HEXAGON));
        builder1.setSize(9.5);
        Footwear sneaker = builder1.build();
        System.out.println(sneaker);
        
        System.out.println();
        
        SixInchBootBuilder builder2 = new SixInchBootBuilder();
        builder2.setMidsole(new Midsole(MidsoleColor.OLIVE));
        builder2.setSize(8);
        SixInchBoot boot1 = builder2.build();
        SixInchBoot boot2 = boot1.copy();
        boot2.setSize(9);
        System.out.println(boot1);
        System.out.println(boot2);
    
        System.out.println();
        
        System.out.println(
                new SneakerBuilder()
                        .withHeelText(new HeelText("Winning solves everything", HeelTextColor.WHITE))
                        .withTongue(new Tongue(TongueColor.BLACK, TongueMaterial.ECO_LEATHER))
                        .withLaces(new Laces(LacesColor.WHITE))
                        .withHardware(new Hardware(HardwareColor.BLACK, HardwareType.HEXAGON))
                        .withSize(10.5)
                        .build()
        );
    }
}
