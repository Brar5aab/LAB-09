package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Role;

import javax.persistence.EntityManager;
import javax.persistence.Query;


/**
 * @author baljit brar
 * @version 1.0
 */
public class RoleDB {

    public List<Role> getAll() throws Exception{
        EntityManager em = dataaccess.DBUtil.getEmFactory().createEntityManager();
        try {
            Query query = em.createNamedQuery("Role.findAll");
            return query.getResultList();
        }finally {
            em.close();
        }
    }

}
