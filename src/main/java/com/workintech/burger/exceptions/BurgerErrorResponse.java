package com.workintech.burger.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BurgerErrorResponse {
    private Integer status;
    private String message;
    private Long timestamp;
}
