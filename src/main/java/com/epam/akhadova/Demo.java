package com.epam.akhadova;

import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

public class Demo {

    static ResourceBundle resource = ResourceBundle.getBundle("file");

    private static String url = resource.getString("path.to.download");
    static File fileName = new File(resource.getString("file.name"));

    public static void main(String args[]) throws IOException {
        DownloadFile.download(url, fileName);
        System.out.println("File successfully saved");
    }

}
