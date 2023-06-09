/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.domain;

import com.fasterxml.jackson.databind.util.LRUMap;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author digal
 */
@Entity
@Data
@Table(name = "employee")
public class Empleado {
    @Id
    public String nombres;
    public String apellidos;
    
}
