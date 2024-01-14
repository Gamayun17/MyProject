package by.me.data.dao;

import by.me.data.DataSource;
import by.me.data.dto.UserDto;
import by.me.data.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public String saveNewPerson(User user) {
        return null;
    }

    @Override
    public String updateNewPerson(User user) {
        return null;
    }

    @Override
    public UserDto findbyId(String id) {
        return null;
    }
}