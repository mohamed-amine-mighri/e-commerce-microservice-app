package com.amine.ecommerce.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Amine_Mighri
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerNotFoundException extends RuntimeException {

    private final String msg;
}