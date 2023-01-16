package cn.uninasa.cascade_test.controller;

import cn.uninasa.cascade_test.dao.TbEntityDao;
import cn.uninasa.cascade_test.entity.TbEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@Api(tags = "测试对象联系人关系")
@RequestMapping(value = "/test/entity",produces = {"application/json; charset=UTF-8"})
public class TbEntityController {
    @Autowired
    private TbEntityDao dao;


    @ApiOperation(value = "查找全部对象及联系人")
    @GetMapping("/findAll")
    public List<TbEntity> findAll(){
        return dao.findAll();
    };

    @ApiOperation(value = "删除对象及联系人")
    @PostMapping("/delete")
    public void delete(@RequestBody Integer id){
        dao.delete(id);
    };

    @ApiOperation(value = "级联增加对象及联系人")
    @PostMapping("/save")
    public TbEntity save(@RequestBody TbEntity tb){
        return dao.save(tb);
    }

}
