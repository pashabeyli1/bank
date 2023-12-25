package az.gdg.bank.service;

import az.gdg.bank.dto.response.RespCustomer;
import az.gdg.bank.dto.response.Response;

import java.util.List;

public interface CustomerService {

    Response<List<RespCustomer>> getCustomerList();
}
