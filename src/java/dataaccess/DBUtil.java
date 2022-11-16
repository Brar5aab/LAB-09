package dataaccess;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.*;

/**
 * * @author baljit brar
 * @version 1.0
 */
public class DBUtil {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("UsersPU");

    public static EntityManagerFactory getEmFactory(){
        return emf;
    }

}
