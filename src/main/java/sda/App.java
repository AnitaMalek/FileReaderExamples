package sda;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {


        //zad.1&2: wczytywanie z pliku simpleExample i wyświetlanie na konsoli
//        File file = new File("C:\\Users\\aohaj\\IdeaProjects\\dataprocessing\\src\\main\\resources\\simpleExample.txt");
//
//        LineIterator fileContents = FileUtils.lineIterator(file, "UTF-8");
//        while (fileContents.hasNext()) {
//            System.out.println(fileContents.nextLine());
//        }


        //zad.3: tworzenie obiektu User i listy obiektów z danymi z pliku users i zad.4: rozbudować algorytm, utworzyć dwie listy
        //na jednej kobiety"a", na drugiej mężczyzni, na listach zapisywać tylko pełnoletnich

        File file1 = new File("C:\\Users\\aohaj\\IdeaProjects\\dataprocessing\\src\\main\\resources\\users.txt");

        List<User> male = new ArrayList<User>();
        List<User> female = new ArrayList<User>();


        LineIterator fileContents = FileUtils.lineIterator(file1, "UTF-8");
        while (fileContents.hasNext()) {
            String[] line = fileContents.nextLine().split(" ");

            if (line[0].endsWith("a") && Integer.parseInt(line[2]) >= 18) {
                female.add(new User(line[0], line[1], Integer.parseInt(line[2])));
            } else if (Integer.parseInt(line[2]) >= 18) {
                male.add(new User(line[0], line[1], Integer.parseInt(line[2])));
            }
        }
            System.out.println("Lista kobiet: " );
            for (User user : female) {
                System.out.println(user);
            }
            System.out.println("Lista mężczyzn: ");
            for (User user1 : male) {
                System.out.println(user1);
            }


        }
    }

