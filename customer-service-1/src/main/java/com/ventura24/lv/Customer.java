/******************************************************************************
 * Copyright (C) 2005 - 2016 Ventura24 S.L.U.                                *
 * *
 * Copyright and license details are included in Ventura24 license file.     *
 ******************************************************************************/
package com.ventura24.lv;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *****************************************************************************
 *  Copyright (C) 2005 - 2016 Ventura24 S.L.U.                                *
 *                                                                            *
 *  Copyright and license details are included in Ventura24 license file.     *
 ******************************************************************************
 * Created by jsanc on 11/02/16.
 */
public class Customer implements Serializable {

    private Long id;
    private String name;
    private BigDecimal balance;

    public Customer() {
    }

    public Customer(final BigDecimal balance, final Long id, final String name) {
        this.balance = balance;
        this.id = id;
        this.name = name;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("balance=").append(this.balance);
        sb.append(", id=").append(this.id);
        sb.append(", name='").append(this.name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
