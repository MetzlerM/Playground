/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webapp4;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 * 
 * @author MetzlerM
 */
@Named(value = "newJSFManagedBean")
@Dependent
public class NewJSFManagedBean {

    private String text; 
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public NewJSFManagedBean() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    
}
