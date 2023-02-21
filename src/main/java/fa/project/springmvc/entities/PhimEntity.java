package fa.project.springmvc.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "dbo.PHIMS")
public class PhimEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String ten_phim;
	
	private String slug_ten_phim;
	
	private String thoi_luong;
	
	private String dao_dien;
	
	private String dien_vien;
	
	private String the_loai;
	
	private String mo_ta;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngay_khoi_chieu;
	
	private boolean tinh_trang;

	public List<LichChieuEntity> getLichChieu() {
		return LichChieu;
	}

	public void setLichChieu(List<LichChieuEntity> lichChieu) {
		LichChieu = lichChieu;
	}

	@OneToMany(mappedBy = "LichChieu_id_phim")
	private List<LichChieuEntity> LichChieu;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen_phim() {
		return ten_phim;
	}

	public void setTen_phim(String ten_phim) {
		this.ten_phim = ten_phim;
	}

	public String getSlug_ten_phim() {
		return slug_ten_phim;
	}

	public void setSlug_ten_phim(String slug_ten_phim) {
		this.slug_ten_phim = slug_ten_phim;
	}

	public String getThoi_luong() {
		return thoi_luong;
	}

	public void setThoi_luong(String thoi_luong) {
		this.thoi_luong = thoi_luong;
	}

	public String getDao_dien() {
		return dao_dien;
	}

	public void setDao_dien(String dao_dien) {
		this.dao_dien = dao_dien;
	}

	public String getDien_vien() {
		return dien_vien;
	}

	public void setDien_vien(String dien_vien) {
		this.dien_vien = dien_vien;
	}

	public String getThe_loai() {
		return the_loai;
	}

	public void setThe_loai(String the_loai) {
		this.the_loai = the_loai;
	}

	public String getMo_ta() {
		return mo_ta;
	}

	public void setMo_ta(String mo_ta) {
		this.mo_ta = mo_ta;
	}

	public LocalDate getNgay_khoi_chieu() {
		return ngay_khoi_chieu;
	}

	public void setNgay_khoi_chieu(LocalDate ngay_khoi_chieu) {
		this.ngay_khoi_chieu = ngay_khoi_chieu;
	}

	public boolean isTinh_trang() {
		return tinh_trang;
	}

	public void setTinh_trang(boolean tinh_trang) {
		this.tinh_trang = tinh_trang;
	}

				}
