package kz.sdu.register.dao;

import kz.sdu.register.models.BoxDot;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BoxDao {

    @Insert("insert into boxtable(userid,itemid) values(#{userid},#{itemid})")
    void addToBox(@Param("userid") String userid,@Param("itemid") String itemid);

    @Select("select id from boxtable where userid = #{userid} and itemid = #{itemid}")
    Integer checkItem(@Param("userid") String userid, @Param("itemid") String itemid);

    @Select("select * from boxtable where userid = #{userid}")
    List<BoxDot> allIdBoxForUser(@Param("userid") String userid);

    @Select("select * from boxtable where id = #{id}")
    BoxDot selectById(@Param("id") int id);

    @Delete("delete from boxtable where id = #{id}")
    void deleteById(@Param("id") int id);

    @Delete("delete from boxtable where itemid = #{id}")
    void deleteByAllItemId(@Param("id") int id);
}
