package kz.sdu.register.dao;

import kz.sdu.register.models.ItemDot;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ItemDao {
    @Select("Select * from itemTable where id = #{id}")
    ItemDot selectOne(@Param("id") long id);

    @Select("Select * from itemTable where name like '%' || #{text} || '%' or description like '%' || #{text} || '%'")
    List<ItemDot> searchAll(@Param("text") String text);

    @Select("select *  from itemtable where userid = #{userid}")
    List<ItemDot> myAllItems(@Param("userid") String userid);

    @Insert("insert into itemTable(name, userid, description) values(#{name}, #{userid}, #{description})")
    void addItem(@Param("name") String name, @Param("userid") String userid, @Param("description") String description);

    @Update("update itemTable set name = #{name}, description = #{description} where id = #{id}")
    void updateItem(@Param("name") String name,@Param("description") String description, @Param("id") long id);

    @Delete("delete from itemTable where id = #{id}")
    void deleteItem(@Param("id") int id);
}
