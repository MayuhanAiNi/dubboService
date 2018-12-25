package cn.itcast.dubbodemo.service.impl;

import cn.itcast.dubbodemo.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "马雨寒1v23v4v5";
    }
}
