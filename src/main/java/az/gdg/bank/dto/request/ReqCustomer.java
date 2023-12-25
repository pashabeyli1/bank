package az.gdg.bank.dto.request;

import lombok.Data;

import java.util.Date;

@Data
public class ReqCustomer {

    private String name;
    private String surname;
    private String address;
    private Date dob;
    private String mobile;
    private String pin;
    private String customerCode;
}
