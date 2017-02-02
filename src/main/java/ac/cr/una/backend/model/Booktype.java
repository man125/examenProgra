/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.backend.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "booktype", catalog = "progra3_exa2")
public class Booktype implements Serializable {
    
    private int idType;
    private String type;
    
    public Booktype() {
    }

    public Booktype(int idType, String type) {
        this.idType = idType;
        this.type = type;
    }

   

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idType", unique = true, nullable = false)
   
    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }


    @Column(name = "tipo", unique = true, nullable = false, length = 10)

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.idType;
        hash = 29 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Booktype other = (Booktype) obj;
        if (this.idType != other.idType) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Booktype{" + "idType=" + idType + ", type=" + type + '}';
    }
    
    
    
    
    
}
