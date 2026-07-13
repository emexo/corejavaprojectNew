package com.emexo.javafeatures.java11;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args) throws IOException, URISyntaxException {

        URI txtFileUri = ReadFile.class.getClassLoader()
                .getResource("file1.txt")
                .toURI();

        /*Path returnedFilePath = Files.writeString(Path.of(txtFileUri),"Hello World!",
                Charset.defaultCharset());*/

        String content = Files.readString(Path.of(txtFileUri), Charset.defaultCharset());

        System.out.println(content);

    }
}
