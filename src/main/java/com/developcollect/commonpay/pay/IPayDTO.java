package com.developcollect.commonpay.pay;

import java.time.LocalDateTime;

/**
 * 支付参数
 *
 * @author zak
 * @since 1.0.0
 */
public interface IPayDTO<SOURCE> extends IExtDto {

    /**
     * 商户订单号
     */
    String getOutTradeNo();

    /**
     * 支付平台订单号
     */
    String getTradeNo();

    /**
     * 获取支付金额
     */
    Long getTotalFee();

    /**
     * 订单开始时间
     */
    default LocalDateTime getTimeStart() {
        return null;
    }

    /**
     * 订单过期时间
     */
    default LocalDateTime getTimeExpire() {
        return null;
    }

    /**
     * 支付平台
     */
    int getPayPlatform();

    /**
     * 原始订单对象
     *
     * @return 原始订单对象
     * @author zak
     * @since 1.0.0
     */
    SOURCE getSource();


}
