package footwear.model.footwear_element;


import footwear.model.footwear_element.color.UpperColor;
import footwear.model.footwear_element.material.UpperMaterial;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Upper {
    private UpperColor color;
    private UpperMaterial material;
}
