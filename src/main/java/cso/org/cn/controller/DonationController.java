package cso.org.cn.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cso.org.cn.common.response.ResponseData;
import cso.org.cn.common.response.ResultData;
import cso.org.cn.entity.Donation;
import cso.org.cn.service.DonationService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: CSO-Portal-Platform
 * @description:  捐赠信息api
 * @organization: Charity-Software-Organization
 * @author: jinyubo
 * @create: 2021-02-27
 */
@RestController
@RequestMapping("/donation")
public class DonationController {
    @Autowired
    private DonationService donationService;



    /**
     * @Description: 分页查信息
     * @Param: [query, pageNo, pageSize]
     * @return: cso.org.cn.common.response.ResponseData
     * @organization: Charity-Software-Organization
     * @Author: jinyubo
     * @date: 2021/2/28
     */
    @RequestMapping("selectPage")
    public ResponseData selectPage(String query, long pageNo, long pageSize) {
        Page<Donation> page = new Page<>(pageNo, pageSize);
        QueryWrapper<Donation> qw = new QueryWrapper<>();
        if (StringUtils.isNotEmpty(query)) {
            qw.like("donation_org_name", query).or().like("donation_project_name", query).or().eq("donation_type", query);
        }
        Page<Donation> res = donationService.page(page, qw);
        return ResultData.buildSuccess(res);
    }


    /**
     * @Description: 根据id查信息
     * @Param: [id]
     * @return: cso.org.cn.common.response.ResponseData
     * @organization: Charity-Software-Organization
     * @Author: jinyubo
     * @date: 2021/2/28
     */
    @RequestMapping("getById/{id}")
    public ResponseData getById(@PathVariable("id") String id) {
        Donation donation = donationService.getById(id);
        return ResultData.buildSuccess(donation);
    }

    /**
     * @Description: 保存信息
     * @Param: [dynamic]
     * @return: cso.org.cn.common.response.ResponseData
     * @organization: Charity-Software-Organization
     * @Author: jinyubo
     * @date: 2021/2/28
     */
    @RequestMapping("save")
    public ResponseData save(@RequestBody Donation donation) {
        boolean res = donationService.saveOrUpdate(donation);
        if (res) {
            return ResultData.buildSuccess(true);
        } else {
            return ResultData.buildError(false);
        }
    }

    /**
     *@Description: 根据id删除信息
     *@Param: [id]
     *@return: cso.org.cn.common.response.ResponseData
     *@organization: Charity-Software-Organization
     *@Author: jinyubo
     *@date: 2021/2/28
     */
    @RequestMapping("del")
    public ResponseData del(String id) {
        boolean res = donationService.removeById(id);
        if (res) {
            return ResultData.buildSuccess(true);
        } else {
            return ResultData.buildError(false);
        }
    }


}

