package application;

import entities.Produto;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

        Set<Produto> set = new TreeSet<>();
        set.add(new Produto("Tv", 2980.00));
        set.add(new Produto("Notebook",3700.00));
        set.add(new Produto("Video Game",4600.00));

        //Produto prod = new Produto("Notebook",3700.00);
        for(Produto p:set){
            System.out.println(p);
        }


    }
}
