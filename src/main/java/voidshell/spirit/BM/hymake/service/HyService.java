package voidshell.spirit.BM.hymake.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import voidshell.spirit.BM.hymake.dao.StatExMapper;

import java.util.List;
import java.util.Map;

@Service
public class HyService {

    @Autowired
    private StatExMapper statExMapper;

    public List<Map<String,Object>> freedomStat(String sql){
        return statExMapper.freedomStat(sql);
    }
}
