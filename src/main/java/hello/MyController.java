
/**
 * Created by aryastark on 02/09/16.
 */
package hello;

        import org.springframework.boot.*;
        import org.springframework.boot.autoconfigure.*;
        import org.springframework.stereotype.*;
        import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/geert")
    String geert() {
        return "foo";
    }

}
