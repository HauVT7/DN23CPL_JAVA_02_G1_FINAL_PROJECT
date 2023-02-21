package fa.project.springmvc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



@Entity
@Table(name = "dbo.TAI_KHOAN")
public class TaiKhoanEntity {

	@Id
	@NotEmpty(message = "Không được để trống")
	private String username;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToOne
	@JoinColumn(name = "id")
	private int id;

    private KhachHangEntity khachHang;
	
	@NotNull(message = "Password is required")
	@Size(min = 8, message = "Password length must be at least 8 characters")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$", message = "Password must contain at least one uppercase letter, one lowercase letter, and one digit")
	private String password;
	 
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public KhachHangEntity getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHangEntity khachHang) {
		this.khachHang = khachHang;
	}


	

}
