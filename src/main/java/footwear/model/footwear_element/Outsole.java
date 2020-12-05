package footwear.model.footwear_element;


import footwear.model.footwear_element.color.OutsoleColor;
import footwear.model.footwear_element.type.OutsoleType;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Outsole {
    private OutsoleColor color;
    private OutsoleType type;
}
