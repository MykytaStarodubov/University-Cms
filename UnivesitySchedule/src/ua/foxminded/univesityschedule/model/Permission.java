package ua.foxminded.univesityschedule.model;

public class Permission {
	private int permissionId;
	private int permissionRoleId;
	private String permissionTitle;
	private String permissionModule;
	private String permissionDescription;

	public Permission(int permissionId, int permissionRoleId, String permissionTitle, String permissionModule,
			String permissionDescription) {
		this.permissionId = permissionId;
		this.permissionRoleId = permissionRoleId;
		this.permissionTitle = permissionTitle;
		this.permissionModule = permissionModule;
		this.permissionDescription = permissionDescription;
	}

	public void addPermission() {
	}

	public void editPermission() {
	}

	public void deletePermission() {
	}

	public void searchPermission() {
	}
}
