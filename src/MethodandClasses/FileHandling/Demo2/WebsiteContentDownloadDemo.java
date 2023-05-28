package MethodandClasses.FileHandling.Demo2;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class WebsiteContentDownloadDemo {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.jobsnepal.com/search?q=");
            URLConnection conn = url.openConnection();
            conn.addRequestProperty("User-Agent","Mozilla/5.0 (Linux; Android 11.0; Surface Duo) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Mobile Safari/537.36");

//            conn.setDoOutput(true);
//            conn.getOutputStream().write("q=java".getBytes());
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );
            Writer writer = new FileWriter("C:/testFile/Web.html");
            while (true ){
                String line = reader.readLine();
                System.out.println(line);
                writer.write(line);
                if (line == null){
//                    System.exit(0);
                    break;
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
