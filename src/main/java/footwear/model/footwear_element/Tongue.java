package footwear.model.footwear_element;


import footwear.model.footwear_element.color.TongueColor;
import footwear.model.footwear_element.material.TongueMaterial;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Tongue {
    private TongueColor color;
    private TongueMaterial material;
}
