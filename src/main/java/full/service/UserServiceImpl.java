package full.service;

import full.entity.Role;
import full.entity.User;
import full.user.CrmUser;

import full.dao.RoleDao;
import full.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

	// need to inject user dao
	@Autowired
	private UserDao userDao;

	@Autowired
	private RoleDao roleDao;

//	@Autowired
//	private User user;

//	@Autowired
//	private User userr;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	@Transactional
	public User findByUserName(String userName) {
		// check the database if the user already exists
		return userDao.findByUserName(userName);
	}

	@Override
	@Transactional
	public void save(CrmUser crmUser) {

		User user = new User();
		// assign user details to the user object
		user.setUserName(crmUser.getUserName());
		user.setPassword(passwordEncoder.encode(crmUser.getPassword()));
		user.setFirstName(crmUser.getFirstName());
		user.setLastName(crmUser.getLastName());
		user.setEmail(crmUser.getEmail());

		// give user default role of "employee"
		user.setRoles(Arrays.asList(roleDao.findRoleByName("ROLE_USER")));

		// save user in the database
		userDao.save(user);
	}

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user = userDao.findByUserName(userName);
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				mapRolesToAuthorities(user.getRoles()));
	}

	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}

//	view users

	@Override
	@Transactional
	public List<User> getUsers() {
		return userDao.getUsers();
	}

	@Override
	@Transactional
	public void saveUser(CrmUser crmUser) {
		User user = new User();
		// assign user details to the user object
		user.setUserName(crmUser.getUserName());
		user.setPassword(passwordEncoder.encode("firmowe"));
		user.setFirstName(crmUser.getFirstName());
		user.setLastName(crmUser.getLastName());
		user.setEmail(crmUser.getEmail());

		// give user default role of "employee"
		user.setRoles(Arrays.asList(roleDao.findRoleByName("ROLE_ADMIN")));

		// save user in the database
		userDao.saveUser(user);
	}

	@Override
	@Transactional
	public User getUser(Long theId) {

		return userDao.getUser(theId);
	}

	@Override
	@Transactional
	public void deleteUser(Long theId) {

		userDao.deleteUser(theId);
	}

	@Override
	@Transactional
	public void saveUpdate(User user) {
		User userr = new User();
		userr.setId(user.getId());
		userr.setUserName(user.getUserName());
		userr.setPassword(passwordEncoder.encode(user.getPassword()));
		userr.setFirstName(user.getFirstName());
		userr.setLastName(user.getLastName());
		userr.setEmail(user.getEmail());

		// give user default role of "employee"
		userr.setRoles(Arrays.asList(roleDao.findRoleByName("ROLE_ADMIN")));

		// save user in the database

		userDao.saveUser(userr);
	}
}
