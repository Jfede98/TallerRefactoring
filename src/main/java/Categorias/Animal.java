/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Categorias;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Bryan
 */
public class Animal implements ObjectSet{
    
    final static String FILE = "/main/resources/imageanimals/";  
    
    final String[] terrestre = {"caballo", "cocodrilo", "elefante", "gato", "hipopotamo", "mono", "perro", "pinguino"}; 
    final String[] marino = {"atun", "caballitodemar", "cocodrilo", "hipopotamo", "pato", "pinguino", "pulpo", "tiburon"};
    final String[] aereo = {"buho", "condor", "paloma", "pato"};
    
    HashSet<String> terrestres = new HashSet<>(Arrays.asList(terrestre));
    HashSet<String> marinos = new HashSet<>(Arrays.asList(marino));
    HashSet<String> aereos = new HashSet<>(Arrays.asList(aereo));
    
    HashSet<String> union = joinAll(terrestres, marinos, aereos);

    @Override
    public HashSet<String> joinAll (HashSet<String> s1, HashSet<String> s2, HashSet<String> s3){
        HashSet<String> s1Clone = (HashSet)s1.clone();
        s1Clone.addAll(s2);
        s1Clone.addAll(s3);
        return s1Clone;
    }
    
    public HashSet<String> joinAll(HashSet<String> s1, HashSet<String> s2){
        HashSet<String> s1Clone = (HashSet)s1.clone();
        s1Clone.addAll(s2);
        return s1Clone;
    }
    
}
