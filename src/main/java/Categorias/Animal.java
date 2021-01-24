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
    
//    final static String[] terrestre = {"caballo", "cocodrilo", "elefante", "gato", "hipopotamo", "mono", "perro", "pinguino"}; 
//    final static String[] marino = {"atun", "caballitodemar", "cocodrilo", "hipopotamo", "pato", "pinguino", "pulpo", "tiburon"};
//    final static String[] aereo = {"buho", "condor", "paloma", "pato"};
    
    final static String[] terrestre = {"elefante", "perro", "caballo", "gato", "mono", "pinguino", "cocodrilo", "hipopotamo"}; 
    final static String[] acuatico = {"pez", "delfin", "tiburon", "caballitodemar", "pezvolador", "cocodrilo", "hipopotamo", "pinguino", "pulpo"};
    final static String[] ave = {"loro", "condor", "avestruz", "pato", "pinguino", "pollito"};
    final static String[] volador = {"mariposa", "pato", "libedula", "abeja", "murcielago", "loro", "condor"};
    final static String[] nadador = {"pez", "delfin", "tiburon", "pinguino","pezvolador", "pato"};
    
    public static HashSet<String> terrestres = new HashSet<>(Arrays.asList(terrestre));
    public static HashSet<String> acuaticos = new HashSet<>(Arrays.asList(acuatico));
    public static HashSet<String> aves = new HashSet<>(Arrays.asList(ave));
    public static HashSet<String> voladores = new HashSet<>(Arrays.asList(volador));
    public static HashSet<String> nadadores = new HashSet<>(Arrays.asList(nadador));
    
    
    public static HashSet<String> unionAll = joinAll(terrestres, acuaticos);


    
//    public HashSet<String> joinAll(HashSet<String> s1, HashSet<String> s2){
//        HashSet<String> s1Clone = (HashSet)s1.clone();
//        s1Clone.addAll(s2);
//        return s1Clone;
//    }
    
    public static void main (String[] args){

        System.out.println(unionAll);

    }

    
    
}
