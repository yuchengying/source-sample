package com.zhuguang.jack.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public class MySelectProvider {
    
      
    /** 
     * @Description TODO 
     * @param @return 参数 
     * @return String 返回类型  
     * @throws 
     * 
     */
        
    public String getAreaSql(RowBounds rb, @Param("userParam") Map a,String psptId) {
        String sql = "select *,date_format(birthday,'%Y-%m-%d') birthday1,date_format(activeTime,'%Y-%m-%d') activeTime1 from consult_idcardinfo where psptId = 1156454654";
        return sql;
    }
}
