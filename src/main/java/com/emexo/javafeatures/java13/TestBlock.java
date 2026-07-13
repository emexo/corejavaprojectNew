package com.emexo.javafeatures.java13;

public class TestBlock {
    public static void main(String[] args) {
        String html ="<html>\n" +
                "   <body>\n" +
                "      <p>Hello, World</p>\n" +
                "   </body>\n" +
                "</html>\n";


        String json ="{\n" +
                "   \"name\":\"mkyong\",\n" +
                "   \"age\":38\n" +
                "}\n";

        String html1 =  """
                <html>
                    <body>
                        <p>Hello, World</p>
                    </body>
                </html>
                        """;



        System.out.println(html1);
    }
}
