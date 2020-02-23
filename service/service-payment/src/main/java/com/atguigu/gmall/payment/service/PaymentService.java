package com.atguigu.gmall.payment.service;

import com.atguigu.gmall.model.order.OrderInfo;
import com.atguigu.gmall.model.payment.PaymentInfo;

import java.util.Map;

public interface PaymentService {
    /**
     * 保存交易记录
     * @param orderInfo
     * @param paymentType 支付类型（1：微信 2：支付宝）
     */
    void savePaymentInfo(OrderInfo orderInfo, String paymentType);

    /**
     * 获取交易记录信息
     * @param out_trade_no
     * @param name
     * @return
     */
    PaymentInfo getPaymentInfo(String out_trade_no, String name);

    /**
     * 支付成功！
     * @param outTradeNo
     * @param paymentType
     * @param paramMap
     */
    void paySuccess(String outTradeNo,String paymentType, Map<String,String> paramMap);
    // 根据第三方交易编号，修改支付交易记录
    void updatePaymentInfo(String outTradeNo, PaymentInfo paymentInfoUpd);
    // 关闭
    void closePayment(Long orderId);
}
