
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

/**
 *
 * @author mguzmana
 */
@Entity
@Table(name = "author", catalog = "progra3_exa2", uniqueConstraints = {
    @UniqueConstraint(columnNames = "nombre")
    })
public class Author implements Serializable {

    private int idAuthor;
    private String name;
    
    public Author() {
    }

    public Author(int idAuthor, String name) {
        this.idAuthor = idAuthor;
        this.name = name;
       
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idAuthor", unique = true, nullable = false)
    public int getId() {
        return idAuthor;
    }

    public void setId(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Column(name = "nombre", unique = true, nullable = false, length = 10)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.idAuthor;
        hash = 59 * hash + (this.name != null ? this.name.hashCode() : 0);
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
        final Author other = (Author) obj;
        if (this.idAuthor != other.idAuthor) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Author{" + "id=" + idAuthor+ ", name=" + name + '}';
    }



}
