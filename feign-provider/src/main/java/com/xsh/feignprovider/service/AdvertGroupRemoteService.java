package com.xsh.feignprovider.service;

import com.xsh.feignprovider.domain.AdvertGroupVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name ="PROVIDER")
public interface AdvertGroupRemoteService {

    @RequestMapping(value = "/group{groupId}",method = RequestMethod.GET)
    AdvertGroupVO findByGroupId(@PathVariable("groupId") Integer adGroupId);

    @RequestMapping(value = "/group/{groupId}",  method = RequestMethod.PUT)
    void update(@PathVariable("groupId") Integer groupId, @RequestParam("groupName") String groupName);

}
