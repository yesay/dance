package cn.suius.dance.mapper;

import cn.suius.dance.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User findByUserName(@Param("username") String username);

}
