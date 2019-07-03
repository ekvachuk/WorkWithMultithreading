package org.itstep;


import org.itstep.model.ConnectionData;
import org.itstep.service.FileManagerservice;
import org.itstep.util.Randomizer;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Date;

public class AppRunner {

    public static void main(String[] args) {

//        Date date = new Date();
//        System.out.println(date);
//        System.out.println(date.getTime());
//
//        date = new Date(0);
//        System.out.println(date);
//        date = new Date(Long.MAX_VALUE);
//        System.out.println(date);

        for (int i = 0; i < 10; i++) {
            AppMultiRunner appMultiRunner = new AppMultiRunner();
            appMultiRunner.start();
        }
    }
}



