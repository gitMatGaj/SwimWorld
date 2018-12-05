package full.dao;

import full.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
