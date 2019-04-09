package com.pcube.midtier.ugar;

import com.pcube.service.provider.ugarservice.TPUgar;
import com.pcube.service.provider.ugarservice.TRUgar;
import com.pcube.service.provider.ugarservice.UgarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by kenya on 2019/3/31.
 */
public class UgarServiceImpl implements UgarService{
    private static final Logger logger = LoggerFactory.getLogger(UgarServiceImpl.class);

    @Override
    public TRUgar interpret(TPUgar tpDemo){
        logger.info("param:{}", tpDemo);
        trDemo.setDemo("hello "+tpDemo.getDemo());
        logger.info("response:{}", trDemo);
        return trDemo;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"application.xml"});
        context.start();
        logger.info("提供者服务已注册成功");
        for(;;) {
            try {
                Thread.sleep(1000 * 10);
            }catch (InterruptedException e){
                logger.warn("interrupt");
            }
        }
    }
}
;