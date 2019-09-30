package INNOQ.Services;

import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.parser.ParserEmulationProfile;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.options.MutableDataHolder;
import com.vladsch.flexmark.util.options.MutableDataSet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class AppService {
    public String markdown(String text) {
        MutableDataHolder options = new MutableDataSet();
        options.setFrom( ParserEmulationProfile.MARKDOWN);

        Parser parser = Parser.builder(options).build();
        HtmlRenderer renderer = HtmlRenderer.builder(options).build();

        Node document = parser.parse(text);

        return renderer.render(document);  // "<p>This is <em>Sparta</em></p>\n"
    }

    public String readFileToString(String pathToFile) { // pass the path to the file as a parameter
        Scanner sc = null;
        try {
            File file = new File(pathToFile);
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String fileText;
        Objects.requireNonNull( sc ).useDelimiter("\\Z"); // we just need to use \\Z as delimiter
        fileText=sc.next();

        return fileText;
    }
}
