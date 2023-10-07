package be.eafcuccle.kewou_durand;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;



public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);



    public static void main(String[] args) {

        for (int i = 0; i < 1_000_000; i++) {

            logger.debug("Message DEBUG n°{}", i);

        }

    }

}


