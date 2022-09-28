package INNOQ.Controllers;

import INNOQ.Services.MarkdownRenderingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    private final MarkdownRenderingService markdownRenderingService;

    public AppController(MarkdownRenderingService service) {
        this.markdownRenderingService = service;
    }

    @GetMapping(value={"", "/", "/index"})
    public String index(Model model) {
        populateModel(model, "index");
        return "main";
    }

    @GetMapping("/produktentwicklung")
    public String ablauf(Model model) {
        populateModel(model, "produktentwicklung");
        return "main";
    }

    @GetMapping("/fachbegriffe")
    public String fachbegriffe(Model model) {
        populateModel(model, "fachbegriffe");
        return "main";
    }

    @GetMapping("/nodejs")
    public String nodejs(Model model) {
        populateModel(model, "nodejs");
        return "main";
    }

    @GetMapping("/mentoren")
    public String mentor(Model model) {
        populateModel(model, "mentoren");
        return "main";
    }

    @GetMapping("/links")
    public String links(Model model) {
        populateModel(model, "links");
        return "main";
    }

    private void populateModel(Model model, String route) {
        model.addAttribute("classActiveSettings", "active");
        model.addAttribute("page", route);
        model.addAttribute("content", markdownRenderingService.renderPage(route));
    }
}


