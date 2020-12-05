package footwear.model.footwear_element;


import footwear.model.footwear_element.color.CollarColor;
import footwear.model.footwear_element.material.CollarMaterial;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Collar {
    private CollarMaterial material;
    private CollarColor color;
}
