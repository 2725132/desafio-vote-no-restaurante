package challenge.repository;

import org.springframework.stereotype.Repository;

import challenge.identity.Customer;
import lombok.Data;
import lombok.NoArgsConstructor;

@Repository
public class CustomerRepository extends GenericRepository<Customer, Long>{
	public CustomerRepository(){
		super(Customer.class);
	}
}
