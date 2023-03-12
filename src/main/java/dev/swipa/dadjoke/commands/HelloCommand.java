package dev.swipa.dadjoke.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class HelloCommand {

    @ShellMethod(key = "hello", value = "I will say hello")
    public String hello() {
        return "Hello World!";
    }

    @ShellMethod(key = "goodbye", value = "I will say goodbye")
    public String goodbye() {
        return "Goodbye!";
    }

    @ShellMethod(key = "helloArg", value = "I will say hello")
    public String helloArg(@ShellOption(defaultValue = "World") String arg) {
        return "Hello, " + arg + "!";
    }
}
