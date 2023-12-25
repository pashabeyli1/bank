package az.gdg.bank.repository;

import az.gdg.bank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Customer findCustomerByIdAndActive(Long id,Integer active);

    List<Customer> findAllByActive(Integer active);


}
