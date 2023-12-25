package az.gdg.bank.service;

import az.gdg.bank.dto.response.RespCustomer;
import az.gdg.bank.dto.response.RespStatus;
import az.gdg.bank.dto.response.Response;
import az.gdg.bank.entity.Customer;
import az.gdg.bank.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    @Override
    public Response<List<RespCustomer>> getCustomerList() {
        Response<List<RespCustomer>> response = new Response<>();
        try {
            List<Customer> customerList = customerRepository.findAllByActive(1);
            List<RespCustomer> respCustomerList = customerList.stream().map(this::convert).collect(Collectors.toList());
            response.setT(respCustomerList);
            response.setStatus(RespStatus.getSuccessMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return response;
    }

    private RespCustomer convert(Customer customer) {
        return RespCustomer.builder()
                .id(customer.getId())
                .name(customer.getName())
                .surname(customer.getSurname())
                .customerCode(customer.getCustomerCode())
                .address(customer.getAddress())
                .dob(customer.getDob())
                .pin(customer.getPin())
                .build();
    }

}
