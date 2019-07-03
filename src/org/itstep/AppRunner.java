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
            ConnectionData connectionData = new ConnectionData();
            connectionData.setSessionId(Randomizer.getRandomNumber(10_000_000, 99_999_999));
            connectionData.setUserLogin(Randomizer.getRandomString(10));
            connectionData.setTime(new Date().getTime() - Randomizer.getRandomNumber(0, 1000 * 60 * 60 * 24));
            connectionData.setIp(Randomizer.getRandomNumber(100, 255) + "." +
                    Randomizer.getRandomNumber(100, 255) + "." +
                    Randomizer.getRandomNumber(100, 255) + "." +
                    Randomizer.getRandomNumber(100, 255));
            FileManagerservice.writeDataToFile(connectionData, true);

        }
    }
}



