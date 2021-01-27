/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Levels;

import Controllers.PaginaFacilController;

/**
 *
 * @author Bryan
 */
public class Easy {
    
    static double radiusLeft = PaginaFacilController.leftSet.getRadius();
    static double xLeft = PaginaFacilController.leftSet.getCenterX();
    static double yLeft = PaginaFacilController.leftSet.getCenterY();
    static double radiusRight = PaginaFacilController.rightSet.getRadius();
    static double xRight = PaginaFacilController.rightSet.getCenterX();
    static double yRight = PaginaFacilController.rightSet.getCenterY();        
       
    static boolean isInsideLeft(){
        
        return true;
    }
    
}
