package com.giovanni.btg.orderms.controller.dto;

import java.math.BigDecimal;

public record OrderResponse(Long orderIs,
                            Long customerId,
                            BigDecimal total) {
}
