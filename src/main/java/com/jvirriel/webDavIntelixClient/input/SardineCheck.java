package com.jvirriel.webDavIntelixClient.input;

import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

import java.io.IOException;

import static com.jvirriel.webDavIntelixClient.constants.PublicConstants.PATH;

public class SardineCheck {

    public static void main(String[] args) throws IOException {

        Sardine sardine = SardineFactory.begin("dark", "dark");
        if (sardine.exists(PATH+"entrada/"+"a.txt"))
            System.out.println("got here!");
        else System.out.println("No Exist");
    }
}
