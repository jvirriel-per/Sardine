package com.jvirriel.webDavIntelixClient.output;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

import java.io.IOException;
import java.util.List;

import static com.jvirriel.webDavIntelixClient.constants.PublicConstants.PATH_SAL;

public class SardinePutSub {

    public static void main(String[] args){
        Sardine sardine = SardineFactory.begin("dark", "dark");
        try {
            if (sardine.exists("http://localhost/entrada/vasaS/"+"b.txt"))
                System.out.println("got here!");
            else sardine.put(PATH_SAL+"vasaS/"+"","".getBytes());

            List<DavResource> res = sardine.list(PATH_SAL);
            for (DavResource dr : res) {
                System.out.println(dr);
            }

            System.out.println();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
