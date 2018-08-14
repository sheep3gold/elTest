package com.yx.dao.impl;

import com.yx.dao.user;
import com.yx.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 18:57 2018/8/14
 * @ Description：${description}
 * @ Modified By：
 */
public class userImpl implements user {
    @Override
    public String getName() {
        String sql="select title from film where film_id=2;";
        ResultSet rs=null;
        PreparedStatement pst = null;
        Connection conn=null;
        String str=null;
        try {
            conn= JDBCUtil.getConnection();
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while (rs.next()) {
                str = rs.getString(1);
            }
            System.out.println(str);
//            return str;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtil.colseResource(conn,pst,rs);
        }
        return str;
    }
}
