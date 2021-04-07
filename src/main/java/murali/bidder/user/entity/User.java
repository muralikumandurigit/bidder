package murali.bidder.user.entity;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Table("users")
@Data
@AllArgsConstructor
public class User {
		
	@Column
	private String type;
	
	@Column
	private String name;
	
	@PrimaryKey
	@Column
	private String email;
	
	@Column
	private String phone;
	
}
