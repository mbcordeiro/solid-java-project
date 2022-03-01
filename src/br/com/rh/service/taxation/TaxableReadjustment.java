package br.com.rh.service.taxation;

import java.math.BigDecimal;

public interface TaxableReadjustment extends Readjustment{
    BigDecimal incomeTaxAmount();
}
