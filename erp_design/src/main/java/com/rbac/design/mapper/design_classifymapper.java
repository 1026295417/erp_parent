package com.rbac.design.mapper;

import com.rbac.design.pojo.design_classify;
import com.rbac.design.pojo.design_classifyQuery;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface design_classifymapper {
    int countByExample(design_classifyQuery example);

    int deleteByExample(design_classifyQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(design_classify record);

    int insertSelective(design_classify record);

    List<design_classify> selectByExample(design_classifyQuery example);

    design_classify selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") design_classify record, @Param("example") design_classifyQuery example);

    int updateByExample(@Param("record") design_classify record, @Param("example") design_classifyQuery example);

    int updateByPrimaryKeySelective(design_classify record);

    int updateByPrimaryKey(design_classify record);

    @Select("select * from product_design_classify where kind_name=#{kind_name} ")
    design_classify selectId(String kind_name);

    @Delete("delete from product_design_classify where p_id=#{pId}  ")
    void deleteclassifyBypId(Integer pId);

    @Delete("delete from product_design_classify where id=#{id}  ")
    void deleteclassifyById(Integer id);
}
