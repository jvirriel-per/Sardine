package com.jvirriel.webDavIntelixClient.input;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static com.jvirriel.webDavIntelixClient.constants.PublicConstants.PATH;

public class SardinePut {

            public static void main(String[] args){
                Sardine sardine = SardineFactory.begin("dark", "dark");
                try {
                    InputStream fis = new FileInputStream(new File("/home/compartido/data/webdav/config/webdav.conf"));
                    if (sardine.exists(PATH+"entrada/"+"webdav.conf"))
                        System.out.println("got here!");
                   else sardine.put(PATH+"/entrada/"+"webdav.conf",fis);

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
