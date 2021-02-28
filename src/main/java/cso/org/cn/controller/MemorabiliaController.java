package cso.org.cn.controller;


import cso.org.cn.entity.Memorabilia;
import cso.org.cn.service.MemorabiliaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: CSO-Portal-Platform
 * @description: 大事记信息api
 * @organization: Charity-Software-Organization
 * @author: jinyubo
 * @create: 2021-02-27
 */
@RestController
@RequestMapping("/memorabilia")
public class MemorabiliaController {

    @Autowired
    private MemorabiliaService memorabiliaService;

    @RequestMapping("selectPage")
    public void selectPage() {
        Memorabilia memorabilia = memorabiliaService.getById(11);
        System.out.println(memorabilia);

    }

}

