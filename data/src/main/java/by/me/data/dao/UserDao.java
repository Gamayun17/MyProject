package by.me.data.dao;


import by.me.data.dto.UserDto;
import by.me.data.entity.User;

public interface UserDao {

        String saveNewPerson(User user);
        String updateNewPerson(User user);

        UserDto findbyId(String id);



}

