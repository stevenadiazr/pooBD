/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author uca
 */
public class FiltroDao implements Metodos<Filtro>{
    private static final String SQL_INSERT = "INSERT INTO filtros_aceite (codFiltro,marca,stock,existencia) VALUES (?,?,?,?)";
    private static final String SQUL_UPDATE = "UPDATE filtros_aceite SET marca = ?, stock=?, existencia = ? WHERE codFiltro=?";
    private static final 
    
}
