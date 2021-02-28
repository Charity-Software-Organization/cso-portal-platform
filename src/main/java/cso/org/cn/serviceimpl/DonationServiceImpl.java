package cso.org.cn.serviceimpl;

import cso.org.cn.entity.Donation;
import cso.org.cn.mapper.DonationMapper;
import cso.org.cn.service.DonationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author CSO
 * @since 2021-02-28
 */
@Service
public class DonationServiceImpl extends ServiceImpl<DonationMapper, Donation> implements DonationService {

}
