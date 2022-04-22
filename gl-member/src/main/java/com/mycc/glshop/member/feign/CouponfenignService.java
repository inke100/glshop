package com.mycc.glshop.member.feign;

import com.mycc.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author inker
 * @date 2022/04/21 14:56
 **/
@FeignClient("gl-coupon")
public interface CouponfenignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R mermberCoupons();
}
