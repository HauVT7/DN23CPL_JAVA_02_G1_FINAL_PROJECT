package fa.project.springmvc.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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

	@OneToMany(mappedBy = "Ghe")
	private Set<GheEntity> Ghe;

	public List<LichChieuEntity> getLichChieu() {
		return LichChieu;
	}

	public void setLichChieu(List<LichChieuEntity> lichChieu) {
		LichChieu = lichChieu;
	}

	@OneToMany(mappedBy = "LichChieu")
	private List<LichChieuEntity> LichChieu;

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
