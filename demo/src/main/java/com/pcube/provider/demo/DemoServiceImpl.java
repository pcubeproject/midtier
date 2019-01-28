package com.pcube.provider.demo;

import com.pcube.service.provider.demo.DemoService;
import com.pcube.service.provider.demo.TPDemo;
import com.pcube.service.provider.demo.TRDemo;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

/**
 * Created by kenya on 2019/1/26.
 */
//@Service(version="1.0.0")
public class DemoServiceImpl implements DemoService{
    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public TRDemo hello(TPDemo tpDemo){
        logger.info("param:{}", tpDemo);
        TRDemo trDemo = new TRDemo();
        trDemo.setDemo("hello "+tpDemo.getDemo());
        logger.info("response:{}", trDemo);
        return trDemo;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"application.xml"});
        context.start();
        logger.info("提供者服务已注册成功");
        try {
            System.in.read();//让此程序一直跑，表示一直提供服务
        } catch (IOException e) {
            logger.error(ExceptionUtils.getStackTrace(e));
        }
    }
}

