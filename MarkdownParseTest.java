import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }


    // @Test
    // public void newTests9() throws IOException {
    //     String content = Files.readString(Path.of("test-file9.md"));
    //     assertEquals(List.of(), MarkdownParse.getLinks(content));
    // }

    @Test public void labTest1() throws IOException {
        String content = "`[a link`](url.com)\n\n[another link](`google.com)`\n\n[`cod[e`](google.com)\n\n[`code]`](ucsd.edu)";
        assertEquals(List.of("`google.com"), MarkdownParse.getLinks(content));
    }

    @Test public void labTest2() throws IOException {
        String content = "[a [nested link](a.com)](b.com)\n\n[a nested parenthesized url](a.com(()))\n\n[some escaped \\[ brackets \\]](example.com)";
        assertEquals(List.of("a.com(()))", "example.com"), MarkdownParse.getLinks(content));
    }

    @Test public void labTest3() throws IOException {
        String content = Files.readString(Path.of("C:/Users/antho/OneDrive/Documents/GitHub/markdown-parser/labTest3.md"));
        assertEquals(List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"), MarkdownParse.getLinks(content));
    }

}