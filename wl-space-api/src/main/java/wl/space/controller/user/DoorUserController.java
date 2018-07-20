package wl.space.controller.user;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wl.space.domain.criteria.DoorUserCriteria;
import wl.space.domain.entity.DoorUserEntity;
import wl.space.request.DoorUserQueryParams;
import wl.space.service.user.DoorUserService;

import java.util.List;


@RestController
public class DoorUserController {

    @Autowired
    private DoorUserService doorUserService;


    /**
     * 根据小票信息录入发票信息
     */
    @RequestMapping("/v1/get/_list")
    public String add(DoorUserQueryParams params) {
        try {
            System.out.println(JSON.toJSONString(params));  // 输出参数

            List<DoorUserEntity> list = doorUserService.selectList(new DoorUserCriteria());

            System.out.println(list); // 输出出参
            return list.toString();
        }catch (Exception e){
            e.printStackTrace(); // todo
            return null;
        }
    }
}
