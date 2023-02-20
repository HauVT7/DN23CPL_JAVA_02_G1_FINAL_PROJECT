package fa.project.springmvc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dbo.GHE_BANS")
public class GheBanEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int id_lich;
	
	private String ten_ghe;
	
	private boolean co_the_ban;
	
	private int id_khach_hang;
	
	private boolean trang_thai;
	
	private String ma_giao_dich;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_lich() {
		return id_lich;
	}

	public void setId_lich(int id_lich) {
		this.id_lich = id_lich;
	}

	public String getTen_ghe() {
		return ten_ghe;
	}

	public void setTen_ghe(String ten_ghe) {
		this.ten_ghe = ten_ghe;
	}

	public boolean isCo_the_ban() {
		return co_the_ban;
	}

	public void setCo_the_ban(boolean co_the_ban) {
		this.co_the_ban = co_the_ban;
	}

	public int getId_khach_hang() {
		return id_khach_hang;
	}

	public void setId_khach_hang(int id_khach_hang) {
		this.id_khach_hang = id_khach_hang;
	}

	public boolean isTrang_thai() {
		return trang_thai;
	}

	public void setTrang_thai(boolean trang_thai) {
		this.trang_thai = trang_thai;
	}

	public String getMa_giao_dich() {
		return ma_giao_dich;
	}

	public void setMa_giao_dich(String ma_giao_dich) {
		this.ma_giao_dich = ma_giao_dich;
	}

		}
