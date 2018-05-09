package com.jvirriel.webDavIntelixClient.output;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

import java.io.IOException;
import java.util.List;

import static com.jvirriel.webDavIntelixClient.constants.PublicConstants.PATH_SAL;

public class SardineDeleteSub {

    public static void main(String[] args) {
        Sardine sardine = SardineFactory.begin("dark", "dark");
        try {

            List<DavResource> res = sardine.list(PATH_SAL+"vasaS/");
            for (DavResource dr : res) {
                System.out.println(dr);
            }
            System.out.println();

            sardine.delete(PATH_SAL+"vasaS/"+ "b.txt");
            res = sardine.list(PATH_SAL+"vasaS/");
            for (DavResource dr : res) {
                System.out.println(dr);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
