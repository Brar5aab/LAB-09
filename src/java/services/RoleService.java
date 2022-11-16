package services;

import dataaccess.RoleDB;
import java.util.List;
import models.Role;

/**
 * @author baljit brar
 * @version 1.0
 */
public class RoleService {

    public List<Role> getAll() throws Exception{
        RoleDB roleDB = new RoleDB();
        return roleDB.getAll();
    }

}
