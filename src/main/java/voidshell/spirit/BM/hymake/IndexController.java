package voidshell.spirit.BM.hymake;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import voidshell.spirit.BM.hymake.service.HyService;
import voidshell.spirit.exception.BizException;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/hy")
public class IndexController {
    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);
    @Value("${environment}")
    private String env;
    @Autowired
    private HyService hyService;


    @RequestMapping("/test")
    public List<Map<String,Object>> test(){
        System.out.println(env);
        logger.info("logback 成功了");
        logger.error("logback 成功了");
        logger.debug("logback 成功了");
        return  hyService.freedomStat("select * from ht_house where ROWNUM < 10");
    }

    @RequestMapping("/test1")
    public String test1(){
        int i = 3;
        if(i==3){
            throw new BizException("123","23123");
        }

        i = i/0;
        return "1231";
    }
}
