package com.abc.myproj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.abc.myproj.entity.SizeInfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;


/**
 *
 * SizeInfo 表数据库控制层接口
 *
 */
public interface SizeInfoMapper extends BaseMapper<SizeInfo> {
  /**
   * 自定义分页
   * @return
   */
  List<SizeInfo> sizelist(Pagination pag,@Param("size") SizeInfo size);
  /**
   * 查询模板列表
   */
  List<SizeInfo> getAllSizeInfo();
  
  SizeInfo getSizeById(int id);
}