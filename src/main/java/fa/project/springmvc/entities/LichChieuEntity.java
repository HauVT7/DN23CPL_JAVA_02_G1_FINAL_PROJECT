package fa.project.springmvc.entities;

import javax.persistence.*;

@Entity
@Table(name = "dbo.LICH_CHIEUS")
public class LichChieuEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int id_phim;
	
	private int id_phong;
	
	private String thoi_luong_chieu_chinh;
	
	private String thoi_luong_quang_cao;
	
	private String thoi_gian_bat_dau;
	
	private String thoi_gian_ket_thuc;

	@ManyToOne
	@JoinColumn(name = "Phong_id")
	private PhongEntity Phong;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_phim() {
		return id_phim;
	}

	public void setId_phim(int id_phim) {
		this.id_phim = id_phim;
	}

	public int getId_phong() {
		return id_phong;
	}

	public void setId_phong(int id_phong) {
		this.id_phong = id_phong;
	}

	public String getThoi_luong_chieu_chinh() {
		return thoi_luong_chieu_chinh;
	}

	public void setThoi_luong_chieu_chinh(String thoi_luong_chieu_chinh) {
		this.thoi_luong_chieu_chinh = thoi_luong_chieu_chinh;
	}

	public String getThoi_luong_quang_cao() {
		return thoi_luong_quang_cao;
	}

	public void setThoi_luong_quang_cao(String thoi_luong_quang_cao) {
		this.thoi_luong_quang_cao = thoi_luong_quang_cao;
	}

	public String getThoi_gian_bat_dau() {
		return thoi_gian_bat_dau;
	}

	public void setThoi_gian_bat_dau(String thoi_gian_bat_dau) {
		this.thoi_gian_bat_dau = thoi_gian_bat_dau;
	}

	public String getThoi_gian_ket_thuc() {
		return thoi_gian_ket_thuc;
	}

	public void setThoi_gian_ket_thuc(String thoi_gian_ket_thuc) {
		this.thoi_gian_ket_thuc = thoi_gian_ket_thuc;
	}

			}
