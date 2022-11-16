package models;


import javax.persistence.*;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
  * @author baljit brar
 * @version 1.0
 */

@Entity
@Table(name = "role")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Role.findAll",query = "select r from Role r")
})
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "role_id")
    private int role_id;

    @Column(name = "role_name")
    @Basic(optional = false)
    private String role_name;


    public Role() {
    }

    public Role(int roleId, String roleName) {
        this.role_id = roleId;
        this.role_name = roleName;
    }

    public int getRoleId() {
        return role_id;
    }

    public void setRoleId(int roleId) {
        this.role_id = roleId;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}
