package ApiExample.Controllers;
import ApiExample.Models.NumberModel;
import ApiExample.Models.NumberResponseModel;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class GreetingController {

    static ArrayList<NumberModel> numbers = new ArrayList<NumberModel>();
    private NumberResponseModel result;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(name = "name") String name) {
        return "Hello, " + name + "!";
    }

    @PostMapping("/addItem")
    public ResponseEntity<NumberResponseModel> addItem(@RequestBody NumberModel item) {
        numbers.add(item);
        List<Integer> evenNumbers = numbers.stream()
                .filter(x -> x.item%2 == 0)
                .map(x -> x.item)
                .toList();

        List<Integer> oddNumbers = numbers.stream()
                .filter(x -> x.item%2 == 1)
                .map(x -> x.item)
                .toList();

        NumberResponseModel result = new NumberResponseModel(evenNumbers,oddNumbers);
        return ResponseEntity.ok(result);

    }

}
