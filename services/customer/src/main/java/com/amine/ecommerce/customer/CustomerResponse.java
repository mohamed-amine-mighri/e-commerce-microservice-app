package com.amine.ecommerce.customer;

/**
 * @author Amine_Mighri
 */
public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email,
        Address address
) {

}