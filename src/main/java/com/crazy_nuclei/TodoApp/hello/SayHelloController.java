package com.crazy_nuclei.TodoApp.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    private static final Logger logger = LoggerFactory.getLogger(SayHelloController.class);

    @RequestMapping("hello")
    @ResponseBody
    public String sayHello() {
        return "Hello Mahn";
    }

    @RequestMapping("hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        String html = """
                <!DOCTYPE html>
                <html>
                <head>
                <title>Sample Page</title>
                </head>
                <body>
                <h1>Hello, World!</h1>
                <p>This is a sample HTML string.</p>
                </body>
                </html>
                """;

        return html;
    }

    @RequestMapping("hello-jsp")
    public String sayHelloJsp(@RequestParam(name = "name", required = false, defaultValue = "Guest") String name,
                              Model model) {
        model.addAttribute("name", name);
        logger.debug("Request param is : {}", name);
        return "sayHello";
    }
}
