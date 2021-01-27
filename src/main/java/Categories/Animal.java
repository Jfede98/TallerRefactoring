/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Categories;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Bryan
 */
public class Animal extends ObjectSet{
    
    final static String FILE = "/main/resources/imageanimals/";  
    
    final static String[] terrestre = {"caballo", "cocodrilo", "elefante", "gato", "perro", "pinguino"}; 
    final static String[] acuatico = {"caballitodemar", "cocodrilo", "pez", "pinguino", "pulpo", "tiburon"};
    final static String[] ave = {"avestruz", "loro", "pato", "pinguino", "pollito"};
    final static String[] volador = {"abeja", "loro", "mariposa", "pato", "pezvolador"};
    final static String[] nadador = {"pato", "pez", "pezvolador", "pinguino", "tiburon"};
    
    public static HashSet<String> terrestres = new HashSet<>(Arrays.asList(terrestre));
    public static HashSet<String> acuaticos = new HashSet<>(Arrays.asList(acuatico));
    public static HashSet<String> aves = new HashSet<>(Arrays.asList(ave));
    public static HashSet<String> voladores = new HashSet<>(Arrays.asList(volador));
    public static HashSet<String> nadadores = new HashSet<>(Arrays.asList(nadador));
    
    public static HashSet<String> unionEasy = joinAll(Animal.terrestres, Animal.acuaticos);
    public static HashSet<String> unionMedium = joinAll(Animal.aves, Animal.voladores, Animal.nadadores);
    
//    public static void main (String[] args){
//
//        System.out.println(unionAll);
////   
//    }

}
