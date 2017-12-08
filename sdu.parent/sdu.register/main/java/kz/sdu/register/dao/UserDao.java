package kz.sdu.register.dao;


import kz.sdu.controller.model.AuthInfo;
import kz.sdu.register.models.UserDot;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {
    @Select("select * from UserTable where id = #{userid}")
    UserDot getWholeSelect(@Param("userid") String userid);

    @Select("select email from UserTable where email = #{email}")
    String checkEmail(@Param("email") String email);

    @Select("select isAccept from UserTable where id = #{id}")
    String checkIsAccepted(@Param("id") String id);

    @Insert("insert into UserTable " +
            "values (#{userid},#{name},#{surname},#{email},#{password},#{telephone},#{birthday}, #{isaccepted},  #{iswho})")
    void insertPerson(@Param("userid") String userid,
                      @Param("name") String name,
                      @Param("surname") String surname,
                      @Param("email") String email,
                      @Param("password") String password,
                      @Param("telephone") String telephone,
                      @Param("birthday") String age,
                      @Param("isaccepted") String isaccepted,
                      @Param("iswho") String iswho);

    @Update("update UserTable set name = #{name}, " +
            "surname = #{surname}, email = #{email}, " +
            "password = #{password}, telephone = #{telephone}," +
            "birthday = #{birthday} where id = #{userid}")
    void updatePerson(@Param("userid") String userid,
                      @Param("name") String name,
                      @Param("surname") String surname,
                      @Param("email") String email,
                      @Param("password") String password,
                      @Param("telephone") String telephone,
                      @Param("birthday") String birthday);




    @Select("select id from UserTable where email=#{email} and password=#{password}")
    String getUserIdSelect(@Param("email") String email,
                           @Param("password") String password);

    @Select("select token from tokentable where userid=#{userid}")
    String getUserToken(@Param("userid") String userid);

    @Select("select userid from tokentable where token=#{token}")
    String getUserIdByToken(@Param("token") String token);

    @Insert("insert into tokentable (token, userid) values(#{token}, #{userid})")
    void insertToken(@Param("userid") String userid,
                     @Param("token") String token);

    @Update("update tokentable set token = #{token} where userid = #{userid}")
    void updateToken(@Param("userid") String userid,
                     @Param("token") String token);


    @Select("select * from UserTable")
    List<UserDot> getAllUsersList();

    @Select("select * from UserTable where isAccept ='0'")
    List<UserDot> getNotAcceptedUsers();

    @Select("update UserTable set isAccept = '1' where id = #{userid}")
    void acceptUser(@Param("userid") String userid);

    @Select("select userid from accepttable where generatednumber=#{generatednumber}")
    String getUserIdFromAccept(@Param("generatednumber") String generatednumber);

    @Insert("insert into accepttable (userid, generatednumber) values(#{userid}, #{generatednumber})")
    void insertIntoAcceptTable(@Param("userid") String userid,
                               @Param("generatednumber") String generatednumber);

    @Select("select email from UserTable where id=#{userid}")
    String getUserEmail(@Param("userid") String userid);

    @Update("update UserTable set isAccept='1' where id = #{userid}")
    void updateIsAccept(@Param("userid") String userid);

    @Update("update UserTable set isAccept='0' where id = #{userid}")
    void declineUser(@Param("userid") String userid);
}
