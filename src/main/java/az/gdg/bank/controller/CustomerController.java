package az.gdg.bank.controller;

import az.gdg.bank.dto.request.ReqCustomer;
import az.gdg.bank.dto.response.RespCustomer;
import az.gdg.bank.dto.response.Response;
import az.gdg.bank.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/list")
    public Response<List<RespCustomer>> getCustomerList() {
        return customerService.getCustomerList();
    }

    @GetMapping("/byId/{customerId}")
    public Response<RespCustomer> getCustomerById(@PathVariable Long customerId) {
        return null;
    }

    @PostMapping("/create")
    public Response addCustomer(@RequestBody ReqCustomer reqCustomer) {
        return null;
    }

}
