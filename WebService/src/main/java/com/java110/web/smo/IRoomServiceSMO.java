package com.java110.web.smo;

import com.java110.core.context.IPageData;
import org.springframework.http.ResponseEntity;

/**
 * 房屋服务类
 */
public interface IRoomServiceSMO {

    /**
     * 添加房屋信息
     *
     * @param pd 页面数据封装对象
     * @return 返回 ResponseEntity对象包含 http状态 信息 body信息
     */
    ResponseEntity<String> saveRoom(IPageData pd);


    /**
     * 查询 房间信息
     *
     * @param pd 页面数据封装对象  分页信息 房屋编号 单元信息
     * @return 返回 ResponseEntity对象包含 http状态 信息 body信息
     */
    ResponseEntity<String> listRoom(IPageData pd);
}