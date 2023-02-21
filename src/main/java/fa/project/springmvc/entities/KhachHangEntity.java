package fa.project.springmvc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import javax.persistence.CascadeType;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name = "dbo.KHACH_HANG")
public class KhachHangEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	
	private String ho_va_ten;
	
	private String email;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate createAt;
	
	private String so_dien_thoai;
	
	
	@OneToOne(mappedBy = "khachHang", cascade = CascadeType.ALL)
	private TaiKhoanEntity taiKhoan;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHo_va_ten() {
		return ho_va_ten;
	}

	public void setHo_va_ten(String ho_va_ten) {
		this.ho_va_ten = ho_va_ten;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDate createAt) {
		this.createAt = createAt;
	}

	public String getSo_dien_thoai() {
		return so_dien_thoai;
	}

	public void setSo_dien_thoai(String so_dien_thoai) {
		this.so_dien_thoai = so_dien_thoai;
	}

	public String getDia_chi() {
		return dia_chi;
	}

	public void setDia_chi(String dia_chi) {
		this.dia_chi = dia_chi;
	}

	public boolean isGioi_tinh() {
		return gioi_tinh;
	}

	public void setGioi_tinh(boolean gioi_tinh) {
		this.gioi_tinh = gioi_tinh;
	}

	private String dia_chi;
	
	private boolean gioi_tinh; 

	
	

	

}
