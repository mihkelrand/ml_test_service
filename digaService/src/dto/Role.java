package dto;

public class Role {

	private String id;
	private String roleCode;
	private String roleName;

	public Role() {}

	public Role(String id, String roleCode, String roleName) {
		super();
		this.id = id;
		this.roleCode = roleCode;
		this.roleName = roleName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
