package INNOQ.Services;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.commonmark.Extension;
import org.commonmark.ext.gfm.tables.TablesExtension;
import org.commonmark.ext.heading.anchor.HeadingAnchorExtension;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.stereotype.Service;

@Service
public class MarkdownRenderingService {

    private static final String MARKDOWN_SOURCE_DIRECTORY = "src/main/resources/static/md/";
    private final Parser parser;
    private final HtmlRenderer renderer;

    MarkdownRenderingService() {
        List<Extension> extensions = List.of(
                TablesExtension.create(),
                HeadingAnchorExtension.create()
        );
        parser = Parser.builder().extensions(extensions).build();
        renderer = HtmlRenderer.builder().extensions(extensions).build();
    }

    public String renderPage(String route) {
        return readMarkdownFilesInDirectory(route).stream()
                .map(parser::parse)
                .map(renderer::render)
                .collect(Collectors.joining("\n"));
    }

    private List<String> readMarkdownFilesInDirectory(String route) {
        try (Stream<Path> paths = Files.walk(Paths.get(MARKDOWN_SOURCE_DIRECTORY + route))) {
            return paths
                    .filter(this::isMarkdownFile)
                    .sorted(Comparator.comparing(Path::toString))
                    .map(this::readMarkdownFile)
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .collect(Collectors.toUnmodifiableList());
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    private Optional<String> readMarkdownFile(Path path) {
        try {
            return Optional.of(Files.readString(path, StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    private Boolean isMarkdownFile(Path path) {
        return Files.isRegularFile(path) && path.toString().toLowerCase().endsWith(".md");
    }
}


