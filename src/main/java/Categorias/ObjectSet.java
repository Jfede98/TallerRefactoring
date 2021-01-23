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
public interface ObjectSet {
    
    HashSet<String> union = new HashSet<>();
    
    HashSet<String> joinAll(HashSet<String> s1, HashSet<String> s2, HashSet<String> s3);
    
}
