package com.jvirriel.webDavIntelixClient.input;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

import java.io.IOException;
import java.util.List;

import static com.jvirriel.webDavIntelixClient.constants.PublicConstants.PATH;

public class SardineCreateDirectory {

    public static void main(String[] args){
        Sardine sardine = SardineFactory.begin("dark", "dark");
        try{
            sardine.createDirectory(PATH + "entrada/");

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

