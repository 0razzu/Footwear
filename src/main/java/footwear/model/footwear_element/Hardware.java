package footwear.model.footwear_element;


import footwear.model.footwear_element.color.HardwareColor;
import footwear.model.footwear_element.type.HardwareType;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Hardware {
    private HardwareColor color;
    private HardwareType type;
}
