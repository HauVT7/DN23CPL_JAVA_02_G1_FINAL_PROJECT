package fa.project.springmvc.entities;

import javax.persistence.*;

@Entity
@Table(name = "dbo.GHES")
public class GheEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String username;
	
	private String ten_ghe;
	
	private boolean tinh_trang;
	
	private int id_phong;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "Phong_id")
	private PhongEntity Phong;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTen_ghe() {
		return ten_ghe;
	}

	public void setTen_ghe(String ten_ghe) {
		this.ten_ghe = ten_ghe;
	}

	public boolean isTinh_trang() {
		return tinh_trang;
	}

	public void setTinh_trang(boolean tinh_trang) {
		this.tinh_trang = tinh_trang;
	}

	public int getId_phong() {
		return id_phong;
	}

	public void setId_phong(int id_phong) {
		this.id_phong = id_phong;
	}

	}
