package com.jvirriel.webDavIntelixClient.output;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

import java.io.IOException;
import java.util.List;

import static com.jvirriel.webDavIntelixClient.constants.PublicConstants.PATH;
import static com.jvirriel.webDavIntelixClient.constants.PublicConstants.PATH_SAL;

public class SardinePut {


    public static void main(String[] args){
        Sardine sardine = SardineFactory.begin("dark", "dark");
        try {
            if (sardine.exists("http://localhost/salida/"+"a.txt"))
                System.out.println("got here!");
            else sardine.put(PATH_SAL+ "","a".getBytes());

            List<DavResource> res = sardine.list(PATH);
            for (DavResource dr : res) {
                System.out.println(dr);
            }

            System.out.println();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
