package voidshell.spirit.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sun.rmi.runtime.Log;

@Component
@Order(1)
@Slf4j
public class AfterServiceStarted implements ApplicationRunner {
    @Value("${environment}")
    private String env;
    @Value("${server.port}")
    private String port;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("++++++++++++++++++++");
        log.info(args.toString());
        log.info("当前环境{}，端口号{}",env,port);
        log.info("Successful service startup!");
        log.info("++++++++++++++++++++");
    }
}
