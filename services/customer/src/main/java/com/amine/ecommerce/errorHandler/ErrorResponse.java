package com.amine.ecommerce.errorHandler;

import java.util.Map;
import java.util.Set;

/**
 * @author Amine_Mighri
 */

public record ErrorResponse(
        Map<String, String> errors
) {

}