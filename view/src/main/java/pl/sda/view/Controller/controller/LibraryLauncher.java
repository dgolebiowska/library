package pl.sda.view.Controller.controller;

import pl.sda.service.AuthorService;

import java.io.IOException;

public class LibraryLauncher {
    public static void main(String[] args) throws IOException {
        AuthorController authorController=new AuthorController();
        authorController.create("jan","kowal","nowawieś");
        authorController.delete((long) 2);
    }
}
