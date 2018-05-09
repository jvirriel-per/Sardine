package com.jvirriel.webDavIntelixClient.general;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

import java.io.IOException;
import java.util.List;

import static com.jvirriel.webDavIntelixClient.constants.PublicConstants.PATH;

public class SardineListFolder {

    public static void main(String[] args) {
        Sardine sardine = SardineFactory.begin("dark", "dark");
        try {
            List<DavResource> res = sardine.list(PATH);
            for (DavResource dr : res) {
                System.out.println(dr);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
