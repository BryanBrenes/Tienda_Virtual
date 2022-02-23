/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda.service;

import com.Tienda.entity.Persona;
import java.util.List;

/**
 *
 * @author bryan
 */
public interface IPersonaService {
    public List<Persona> getAllPerson();
    public void savePerson(Persona persona);
    public Persona getPersonById (long id);
    public void delete(long id);
}
