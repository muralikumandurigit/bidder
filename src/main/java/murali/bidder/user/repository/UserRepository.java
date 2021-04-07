package murali.bidder.user.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import murali.bidder.user.entity.User;

@Repository
public interface UserRepository extends CassandraRepository<User, String> {

	public User findByEmail(String email);

}
