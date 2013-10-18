package cz.jiripinkas.example.mailer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.jiripinkas.example.mailer.entity.Role;
import cz.jiripinkas.example.mailer.entity.Role.ROLE_TYPE;
import cz.jiripinkas.example.mailer.repository.RoleRepository;

@Service
@Transactional
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;

	public Role save(Role role) {
		return roleRepository.save(role);
	}

	public Role findOne(int roleId) {
		return roleRepository.findOne(roleId);
	}

	public Role findOne(ROLE_TYPE name) {
		return roleRepository.findByName(name);
	}
}
