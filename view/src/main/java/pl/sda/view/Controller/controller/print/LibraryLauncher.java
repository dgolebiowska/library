package pl.sda.view.Controller.controller.print;

import pl.sda.domain.*;
import pl.sda.view.Controller.controller.entry.AuthorController;
import pl.sda.view.Controller.controller.entry.BookController;
import pl.sda.view.Controller.controller.entry.BorrowerCotroller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class LibraryLauncher {
//    public enum State {
//        START,
//        CREATE_BOOK,
//        DELETE_BOOK,
//        BORROW_BOOK,
//        RETURN_BOOK
//    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        PrintClass.Menu1();
        int positionM1 = scanner.nextInt();//start wyjdz
        switch (positionM1) {
            case 1:
                PrintClass.Menu1Poz1();
                PrintClass.Menu2();
                int positionM2 = scanner.nextInt();

            switch (positionM2) {

                case 1:
                    PrintClass.Menu2Poz1AD();
                    break;
                case 2:
                    PrintClass.Menu2Poz2AD();
                    break;
                case 3:
                    PrintClass.Menu2Poz3AD();
                    break;
                case 4:
                    PrintClass.Menu2Poz4AD();
                    break;
                case 5:
                    PrintClass.Menu2Poz5AD();
                    break;
                case 6:
                    PrintClass.Menu2Poz6AD();
            }
            case 2:
                PrintClass.Menu1Poz2();
                break;

        }
    }
}


////            }
////            case DELETE_BOOK: {
//
////                break;
////            }
////            case BORROW_BOOK:{

//                //break;
//          //  }
//            //case RETURN_BOOK:{
//
//          //  }
//
//
//
//        }
//
//
//
//
