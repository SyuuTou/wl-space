package wl.space.service.user;


import wl.space.domain.criteria.DoorUserCriteria;
import wl.space.domain.entity.DoorUserEntity;

import java.util.List;

public interface DoorUserService {

    /**
     * 查询
     * */
    List<DoorUserEntity> selectList(DoorUserCriteria criteria);
}
