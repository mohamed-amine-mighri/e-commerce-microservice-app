package com.amine.ecommerce.customer;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Amine_Mighri
 */

public interface CustomerRepository extends MongoRepository<Customer, String > {

}