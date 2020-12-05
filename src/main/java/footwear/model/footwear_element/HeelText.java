package footwear.model.footwear_element;


import footwear.model.footwear_element.color.HeelTextColor;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class HeelText {
    private String text;
    private HeelTextColor color;
}
