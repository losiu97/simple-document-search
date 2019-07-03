package database;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class FileLoader {

    public static Stream<String> getLinesFromFile(String documentsFile) {
        try {
            return Files.lines(Paths.get(ClassLoader.getSystemResource(documentsFile).toURI()));
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException("Cannot load documents file");
        }
    }
}
