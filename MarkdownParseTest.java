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
        assertEquals(3, 1 + 1);
    }

    @Test public void newTests5() throws IOException {
        String content = Files.readString(Path.of("test-file5.md"));
        assertEquals(List.of("pasdfasdage.com"), MarkdownParse.getLinks(content));
    }


}