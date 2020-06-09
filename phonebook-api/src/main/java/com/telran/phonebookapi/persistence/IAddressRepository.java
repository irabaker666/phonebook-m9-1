package com.telran.phonebookapi.persistence;

import com.telran.phonebookapi.model.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IAddressRepository extends CrudRepository<Address, Integer> {

    public List<Address> findByContactId(int id);

    public void removeAddressByAddress(String address);

}
