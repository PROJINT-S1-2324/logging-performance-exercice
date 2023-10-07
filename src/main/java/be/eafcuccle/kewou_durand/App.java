package be.eafcuccle.kewou_durand;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;


public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);




    public static void main(String[] args) {

        long startTime = System.nanoTime();



        for (int i = 0; i < 1_000_000; i++) {

            logger.debug("Message DEBUG n°{}", i);

        }



        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1_000_000;  // convert to milliseconds

        logger.info("Duration: {} ms", duration);

    }

}


