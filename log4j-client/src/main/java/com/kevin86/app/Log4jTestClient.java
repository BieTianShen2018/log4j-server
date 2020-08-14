package com.kevin86.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

/**
 * @Description:
 * @Author: kevin chen
 * @Create: 2020/07/27 18:50
 */
public class Log4jTestClient {

    private static final Logger logger = LoggerFactory.getLogger(Log4jTestClient.class);

    public static void main(String[] args) {
        MDC.put("TRACEID", UUID.randomUUID().toString());
        try {
            MDC.put("IP", InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            logger.error(e.getMessage(),e);
        }
        while (true) {
            logger.trace("111111");
            logger.debug("222222");
            logger.info("333333");
            logger.error("444444");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
