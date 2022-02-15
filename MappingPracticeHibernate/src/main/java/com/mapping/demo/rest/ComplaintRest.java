package com.mapping.demo.rest;

import com.mapping.demo.UserRepo.ComplaintRepository;

import com.mapping.demo.entity.Complaint;
import com.mapping.demo.exception.ExceptionClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("cp/")
public class ComplaintRest
{


    @Autowired
    private ComplaintRepository complaintRepository;

    @GetMapping(value="complaint")
    @Cacheable("cmp")
    public List<Complaint> getAllAddress()
    {
        return complaintRepository.findAll();
    }

//    @PostMapping(value="complaint")
//    @CacheEvict("complaint")
//    public Complaint addComplaintByUserId(@RequestBody Complaint complaint)
//    {
//        return complaintRepository.save(complaint);
//    }
//

    @GetMapping("/complaint/{id}")
//    @Cacheable("complaint")
    public Complaint getAddressById(@PathVariable("id") Integer id) throws ExceptionClass {
        return complaintRepository.findById(id).orElseThrow(() ->  new ExceptionClass("user Not Found"));
    }

    @PostMapping("complaint/{uid}")
    @CacheEvict(value = "cmp",allEntries = true)
    public void AddComplaintByUserId(@RequestBody Complaint complaint,@PathVariable("uid") Integer uid)
    {
        System.out.println(complaint);
        System.out.println(uid);
         this.complaintRepository
                .AddComplaintByUserId(complaint.getCid(),complaint.getComplaintDescription(),complaint.getComplaintType(),uid);
    }

    @GetMapping("userComplaint/{uid}")
//    @Cacheable("complaint")
    public List<Complaint> complaintByUserId(@PathVariable("uid") Integer uid)
    {
        return complaintRepository.getAllComplaintByUserId(uid);
    }


}
