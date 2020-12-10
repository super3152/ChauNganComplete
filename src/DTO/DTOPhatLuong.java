/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Admin
 */
public class DTOPhatLuong {
    int MaPhatLuong;
    int MaNV;   
    String NgayPhat;
    String SoCaDiLam;
    String SoCaNghi;
    String TienThuong;
    String TienPhat;   
    String GhiChu;
    int MaLuong;
    String TongLuong;
    int trangthai;
    int thang;
    int nam;

    public DTOPhatLuong(int MaNV, int thang, int nam) {
        this.MaNV = MaNV;
    
        this.thang = thang;
        this.nam = nam;
    }
    

    
    
    public DTOPhatLuong(int MaPhatLuong, int MaNV, String NgayPhat, String SoCaDiLam, String SoCaNghi, String TienThuong, String TienPhat, String GhiChu, int MaLuong, String TongLuong) {
        this.MaPhatLuong = MaPhatLuong;
        this.MaNV = MaNV;
        this.NgayPhat = NgayPhat;
        this.SoCaDiLam = SoCaDiLam;
        this.SoCaNghi = SoCaNghi;
        this.TienThuong = TienThuong;
        this.TienPhat = TienPhat;
        this.GhiChu = GhiChu;
        this.MaLuong = MaLuong;
        this.TongLuong = TongLuong;
    }

    public DTOPhatLuong(int MaNV, String NgayPhat, String SoCaDiLam, String SoCaNghi, String TienThuong, String TienPhat, String GhiChu, int MaLuong, String TongLuong) {
        this.MaNV = MaNV;
        this.NgayPhat = NgayPhat;
        this.SoCaDiLam = SoCaDiLam;
        this.SoCaNghi = SoCaNghi;
        this.TienThuong = TienThuong;
        this.TienPhat = TienPhat;
        this.GhiChu = GhiChu;
        this.MaLuong = MaLuong;
        this.TongLuong = TongLuong;
    }

    
    
    public DTOPhatLuong() {
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    
    
    
    public int getMaPhatLuong() {
        return MaPhatLuong;
    }

    public void setMaPhatLuong(int MaPhatLuong) {
        this.MaPhatLuong = MaPhatLuong;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public String getNgayPhat() {
        return NgayPhat;
    }

    public void setNgayPhat(String NgayPhat) {
        this.NgayPhat = NgayPhat;
    }

    public String getSoCaDiLam() {
        return SoCaDiLam;
    }

    public void setSoCaDiLam(String SoCaDiLam) {
        this.SoCaDiLam = SoCaDiLam;
    }

    public String getSoCaNghi() {
        return SoCaNghi;
    }

    public void setSoCaNghi(String SoCaNghi) {
        this.SoCaNghi = SoCaNghi;
    }

    public String getTienThuong() {
        return TienThuong;
    }

    public void setTienThuong(String TienThuong) {
        this.TienThuong = TienThuong;
    }

    public String getTienPhat() {
        return TienPhat;
    }

    public void setTienPhat(String TienPhat) {
        this.TienPhat = TienPhat;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public int getMaLuong() {
        return MaLuong;
    }

    public void setMaLuong(int MaLuong) {
        this.MaLuong = MaLuong;
    }

    public String getTongLuong() {
        return TongLuong;
    }

    public void setTongLuong(String TongLuong) {
        this.TongLuong = TongLuong;
    }

   
}
