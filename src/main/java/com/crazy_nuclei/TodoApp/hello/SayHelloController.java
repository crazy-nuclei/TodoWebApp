package com.crazy_nuclei.TodoApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

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
}
