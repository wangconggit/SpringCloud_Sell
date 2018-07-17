package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 订单接口
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}

