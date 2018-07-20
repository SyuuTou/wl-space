package wl.space.service.user.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wl.space.dao.user.DoorUserDao;
import wl.space.domain.criteria.DoorUserCriteria;
import wl.space.domain.entity.DoorUserEntity;
import wl.space.service.user.DoorUserService;

import java.util.List;

@Service
public class DoorUserServiceImpl implements DoorUserService{

    @Autowired
    private DoorUserDao doorUserDao;


    @Override
    public List<DoorUserEntity> selectList(DoorUserCriteria criteria) {
        return doorUserDao.selectList(criteria);
    }
}
