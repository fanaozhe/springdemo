package top.fanaozhe.springdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author faz
 * @create 2020-12-28-9:41
 */
@RestController
public class MyHello {
    @RequestMapping("say")
    public String sayHello(){
        return "hello java";
    }
}
