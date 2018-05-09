package com.jvirriel.webDavIntelixClient.output;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

import java.io.*;
import java.util.List;

import static com.jvirriel.webDavIntelixClient.constants.PublicConstants.PATH_SAL;

public class SardineGetSub {

    public static void main(String[] args) {
        Sardine sardine = SardineFactory.begin("dark", "dark");
        try {
            InputStream is = sardine.get(PATH_SAL+"/vasaS/"+ "b.txt");
            File file = new File("/home/compartido/descargas/"+ "b.txt");
            OutputStream os = new FileOutputStream(file);

            int len; byte buf[] = new byte[16384];
            while((len=is.read(buf))>0) os.write(buf,0,len);
            os.close();
            is.close();

            List<DavResource> res = sardine.list(PATH_SAL);
            for (DavResource dr : res) {
                System.out.println(dr);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
