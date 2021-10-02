package INNOQ.Controllers;

import INNOQ.Services.AppService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.io.File;
import java.util.Arrays;
import java.util.Objects;

@Controller
public class AppController {

    private final AppService appService;

    public AppController(AppService service) {
        this.appService = service;
    }

    @GetMapping(value={"", "/", "/index"})
    public String index(Model model) {
        makeActive(model);
        model.addAttribute("page", "index");
        readFilesToModelMap(model, "index");
        return "main";
    }

    @GetMapping("/ablauf")
    public String ablauf(Model model) {
        makeActive(model);
        model.addAttribute("page", "ablauf");
        readFilesToModelMap(model, "ablauf");
        return "main";
    }

    @GetMapping("/fachbegriffe")
    public String fachbegriffe(Model model) {
        makeActive(model);
        model.addAttribute("page", "fachbegriffe");
        readFilesToModelMap(model, "fachbegriffe");
        return "main";
    }

    @GetMapping("/mentoren")
    public String mentor(Model model) {
        makeActive(model);
        model.addAttribute("page", "mentoren");
        readFilesToModelMap(model, "mentoren");
        return "main";
    }

    @GetMapping("/links")
    public String links(Model model) {
        makeActive(model);
        model.addAttribute("page", "links");
        readFilesToModelMap(model, "links");

        return "main";
    }

    private void makeActive(Model model) {
        model.addAttribute("classActiveSettings","active");
    }

    private void readFilesToModelMap(Model model, String url) {
        File folder = new File("src/main/resources/static/md/" + url);
        File[] listOfFiles = folder.listFiles( (dir, name) -> name.toLowerCase().endsWith(".md") );
        Arrays.sort(listOfFiles);

        String content = "";

        for (File oneFile : Objects.requireNonNull( listOfFiles ))
            if (oneFile.isFile())
                content += appService.markdown(appService.readFileToString(oneFile.getPath()));

        model.addAttribute("content", content);
    }
}


