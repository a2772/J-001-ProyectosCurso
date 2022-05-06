/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectclass.articulos;

/**
 *
 * @author paris
 */
public class TiendasAcampar extends Campismo implements DevolverProducto{
    @Override
    public String regresaProducto(int id) {
        return Integer.toString(this.getId());
    }
}
