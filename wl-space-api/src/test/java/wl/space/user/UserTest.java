package wl.space.user;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import wl.space.dao.user.DoorUserDao;
import wl.space.domain.criteria.DoorUserCriteria;
import wl.space.domain.entity.DoorUserEntity;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {


	@Resource
	private DoorUserDao doorUserDao;

	@Test
	public void testSubmitEInvoiceInfo(){
		List<DoorUserEntity> list = doorUserDao.selectList(new DoorUserCriteria());
		System.out.println(JSON.toJSONString(list));
	}



}
