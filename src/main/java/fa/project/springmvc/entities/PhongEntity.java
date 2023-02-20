package fa.project.springmvc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dbo.PHONGS")
public class PhongEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String ten_phong;
	
	private boolean tinh_trang;
	
	private String hangdoc;
	
	private String hangngang;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen_phong() {
		return ten_phong;
	}

	public void setTen_phong(String ten_phong) {
		this.ten_phong = ten_phong;
	}

	public boolean isTinh_trang() {
		return tinh_trang;
	}

	public void setTinh_trang(boolean tinh_trang) {
		this.tinh_trang = tinh_trang;
	}

	public String getHangdoc() {
		return hangdoc;
	}

	public void setHangdoc(String hangdoc) {
		this.hangdoc = hangdoc;
	}

	public String getHangngang() {
		return hangngang;
	}

	public void setHangngang(String hangngang) {
		this.hangngang = hangngang;
	}

		}
