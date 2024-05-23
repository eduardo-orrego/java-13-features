package org.example.jep355.newtextblocks;

public class NewTextBlocksDemo01 {
    public static void main(String[] args) {
        System.out.println("-----Using 'one-dimensional' string literals-----");

        String html = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, world</p>\n" +
                "    </body>\n" +
                "</html>\n";
        System.out.println(html);

        System.out.println("-----Using a 'two-dimensional' block of text-----");
        String html2 = """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """;
        System.out.println(html2);
    }
}
