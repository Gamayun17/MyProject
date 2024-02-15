package by.me.data.dao;

import by.me.data.dto.RoleDto;

public interface RoleDao {
    RoleDto getRoleById(int id);
    int addRole(RoleDto roleDto);
    boolean deleteRole(int id);
}
