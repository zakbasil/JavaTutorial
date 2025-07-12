package ApiExample.Models;
import java.util.List;

public class NumberResponseModel {
    public List<Integer> oddNumbers;
    public List<Integer> evenNumbers;

    public NumberResponseModel(List<Integer> evenNumbers, List<Integer> oddNumbers) {
        this.evenNumbers = evenNumbers;
        this.oddNumbers = oddNumbers;
    }
}
