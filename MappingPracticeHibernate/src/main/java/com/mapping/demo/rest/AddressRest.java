package com.mapping.demo.rest;

import com.mapping.demo.UserRepo.AddressRepository;
import com.mapping.demo.dto.OnlyUserAddress;
import com.mapping.demo.entity.Address;
import com.mapping.demo.entity.User;
import com.mapping.demo.exception.ExceptionClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("ad/")
public class AddressRest
{


    @Autowired
    private AddressRepository addressRepository;

    @GetMapping(value="address")
    public List<Address> getAllAddress()
    {
        return addressRepository.findAll();
    }

    @GetMapping("OnlyAdress")
    public List<OnlyUserAddress> getOnlyAddressRecord()
    {
        List<OnlyUserAddress> collect = addressRepository.findAll().stream()
                .map(u -> new OnlyUserAddress(u.getAId(),u.getStreet(),u.getFullAddress(),u.getUser().getId()))
                .collect(Collectors.toList());
        return collect;
    }

//    @PostMapping(value="address")
//    public User addAddress(@RequestBody Add user)
//    {
//        return addressRepository.save(user);
//    }

    @GetMapping("/address/{id}")
    public Address getAddressById(@PathVariable("id") Integer id) throws ExceptionClass {
        return addressRepository.findById(id).orElseThrow(() ->  new ExceptionClass("user Not Found"));
    }
//    @PutMapping(value="address")
//    public User updateAddress(@RequestBody User user)
//    {
//        return addressRepository.saveAndFlush(user);
//    }
//
//    @DeleteMapping("address/{id}")
//    public String deleteAddressById(@PathVariable Integer id)
//    {
//        this.addressRepository.deleteById(id);
//        return "Address deleted";
//    }


}
