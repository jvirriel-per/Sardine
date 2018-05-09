package com.jvirriel.webDavIntelixClient.input;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

import java.io.IOException;
import java.util.List;

import static com.jvirriel.webDavIntelixClient.constants.PublicConstants.PATH_ENT;

public class SardinePutSub {

    public static void main(String[] args){
        Sardine sardine = SardineFactory.begin("dark", "dark");
        try{
            if (sardine.exists("http://localhost/entrada/vasaE/"+"a.txt"))
                System.out.println("got here!");
            else sardine.put(PATH_ENT+"vasaE/"+"a.txt","".getBytes());

            List<DavResource> res = sardine.list(PATH_ENT);
            for (DavResource dr : res) {
                System.out.println(dr);
            }

            System.out.println();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
