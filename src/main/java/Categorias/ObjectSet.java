/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Categorias;

import java.util.HashSet;

/**
 *
 * @author Bryan
 */
public abstract class ObjectSet {
    
    HashSet<String> union = new HashSet<>();

    HashSet<String> joinAll(HashSet<String> s1, HashSet<String> s2){
        HashSet<String> unionSet = (HashSet)s1.clone();
        unionSet.addAll(s2);
        return unionSet;
    }
    
    static HashSet<String> joinAll(HashSet<String> s1, HashSet<String> s2, HashSet<String> s3){
        HashSet<String> unionSet = (HashSet)s1.clone();
        unionSet.addAll(s2);
        unionSet.addAll(s3);
        return unionSet;
    }
    
    HashSet<String> intersectionAll(HashSet<String> s1, HashSet<String> s2){
        HashSet<String> intersectionSet = (HashSet)s1.clone();
        intersectionSet.retainAll(s2);
        return intersectionSet;
    }
    
    HashSet<String> intersectionAll(HashSet<String> s1, HashSet<String> s2, HashSet<String> s3){
        HashSet<String> intersectionSet = (HashSet)s1.clone();
        intersectionSet.retainAll(s2);
        intersectionSet.retainAll(s3);
        return intersectionSet;
    }
    
    
    
}
