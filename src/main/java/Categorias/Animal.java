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
public class Animal extends ObjectSet{
    
    final static String FILE = "/main/resources/imageanimals/";  
    
    final static String[] terrestre = {"caballo", "cocodrilo", "elefante", "gato", "hipopotamo", "mono", "perro", "pinguino"}; 
    final static String[] marino = {"atun", "caballitodemar", "cocodrilo", "hipopotamo", "pato", "pinguino", "pulpo", "tiburon"};
    final static String[] aereo = {"buho", "condor", "paloma", "pato"};
    
    public static HashSet<String> terrestres = new HashSet<>(Arrays.asList(terrestre));
    public static HashSet<String> marinos = new HashSet<>(Arrays.asList(marino));
    public static HashSet<String> aereos = new HashSet<>(Arrays.asList(aereo));
    
    public static HashSet<String> unionAll = joinAll(terrestres, marinos, aereos);


    
//    public HashSet<String> joinAll(HashSet<String> s1, HashSet<String> s2){
//        HashSet<String> s1Clone = (HashSet)s1.clone();
//        s1Clone.addAll(s2);
//        return s1Clone;
//    }
    
//    public static void main (String[] args){
//
//        System.out.println(joinAll(terrestres, marinos, aereos));
//        
//        System.out.println(a.joinAll(a.terrestres, aereos));
//        
//        System.out.println(a.joinAll(a.terrestres, a.marinos));
//    }

    
    
}
