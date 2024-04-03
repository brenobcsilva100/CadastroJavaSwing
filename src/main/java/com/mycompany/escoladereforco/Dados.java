/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escoladereforco;

/**
 *
 * @author breno
 */
public class Dados {
    public boolean validarUsuario(String usuario, String senha){
        if(usuario.equals("san1") && senha.equals("123")){
            return true;
        }else{
            return false;
        }
    }
    
}
