package org.itstep.service;

import org.itstep.model.ConnectionData;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileManagerservice {

    private static final String MAIN_DIR = System.getProperty("user.dir");
    private static final String SEPARATOR = System.getProperty("file.separator");

    private static final String filePath = MAIN_DIR + SEPARATOR + "files" + SEPARATOR + "connection_log.txt";

    public static List <ConnectionData> getDataFromFile () {
        List<ConnectionData> connections = new ArrayList<>();

        try (
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        )
        {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                ConnectionData connectionData = getDataFromLine(line);
                connections.add (connectionData);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return connections;
    }

    private static ConnectionData getDataFromLine(String line) {
        ConnectionData connectionData = new ConnectionData();
        return connectionData;
    }

    public static void writeDataToFile (ConnectionData connectionData, boolean append) {

        try ( FileWriter fileWriter = new FileWriter(filePath, append)) {
           fileWriter.write(connectionData.getSessionId() + " " + connectionData.getTime() + " "
                            + connectionData.getIp() + " " + connectionData.getUserLogin() + "\n");
           fileWriter.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
