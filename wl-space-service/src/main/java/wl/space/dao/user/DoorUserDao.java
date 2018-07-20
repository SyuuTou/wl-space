package wl.space.dao.user;

import org.springframework.stereotype.Repository;
import wl.space.dao.base.AbstractCommonDao;
import wl.space.dao.base.TableDes;
import wl.space.domain.criteria.DoorUserCriteria;
import wl.space.domain.entity.DoorUserEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@TableDes(nameSpace = "door_userMapper", tableName = "DoorUser")
@Repository
public class DoorUserDao extends AbstractCommonDao<DoorUserEntity, DoorUserCriteria, Long> {

}