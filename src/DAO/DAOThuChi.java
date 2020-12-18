/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DTOPhieuThuChi;
import java.sql.ResultSet;

/**
 *
 * @author KMB1604
 */
public class DAOThuChi {
    public static int TaoPhieuThuChiNV(DTOPhieuThuChi ptc) {
        String cauTruyVan = "INSERT INTO `ThuChi`( `mathuchi`,`idnguoidung`, `loaiphieu`,`hangmucthuchi`, tongtien, ghichu)"
                + " VALUES ("
                + "'" + ptc.getMaThuChi() + "',"
                  + "'" + ptc.getIDNguoiDung()+ "',"
              
                + "'" + ptc.getLoaiPhieu() + "',"
                + "'" + ptc.getHangMucThuChi() + "',"
                + "'" + ptc.getTongTien() + "',"
                + "'" + ptc.getGhiChu() + "')";
        System.out.println(cauTruyVan);
        return DBConection.ExcuteTruyVan(cauTruyVan);
    }
    
     public static int TaoPhieuThuChiKH(DTOPhieuThuChi ptc) {
        String cauTruyVan = "INSERT INTO `ThuChi`( `mathuchi`, `idkhachhang`,`loaiphieu`,`hangmucthuchi`, tongtien, ghichu)"
                + " VALUES ("
                + "'" + ptc.getMaThuChi() + "',"
                 
                + "'" + ptc.getIDKhachHang() + "',"
                 
                + "'" + ptc.getLoaiPhieu() + "',"
                + "'" + ptc.getHangMucThuChi() + "',"
                + "'" + ptc.getTongTien() + "',"
                + "'" + ptc.getGhiChu() + "')";
        System.out.println(cauTruyVan);
        return DBConection.ExcuteTruyVan(cauTruyVan);
    }
     
      public static int TaoPhieuThuChiNCC(DTOPhieuThuChi ptc) {
        String cauTruyVan = "INSERT INTO `ThuChi`( `mathuchi`,`idnhacungcap`,`loaiphieu`,`hangmucthuchi`, tongtien, ghichu)"
                + " VALUES ("
                + "'" + ptc.getMaThuChi() + "',"
               
                  + "'" + ptc.getIDNhaCungCap()+ "',"
                + "'" + ptc.getLoaiPhieu() + "',"
                + "'" + ptc.getHangMucThuChi() + "',"
                + "'" + ptc.getTongTien() + "',"
                + "'" + ptc.getGhiChu() + "')";
        System.out.println(cauTruyVan);
        return DBConection.ExcuteTruyVan(cauTruyVan);
    }
        public static ResultSet LayPhieuThuChi(String TuKhoa, int trang){
          String query = "select * from ThuChi"
                  + " where `mathuchi` like '%" + TuKhoa + "%' or `idnhacungcap` like '%" + TuKhoa + "%' or `idkhachhang` like '%" + TuKhoa + "%' or `idnguoidung` like '%" + TuKhoa + "%'"
                  + "or `loaiphieu` like '%" + TuKhoa + "%' or `hangmucthuchi` like '%" + TuKhoa + "%'or `tongtien` like '%" + TuKhoa + "%' limit "+trang+",9";
          ResultSet rs = DAO.DBConection.GetData(query);
          return rs;
      }
     public static ResultSet LayPhieuThuChiHangMuc(){
          String query = "select * from ThuChi";
          ResultSet rs = DAO.DBConection.GetData(query);
          return rs;
      }
     public static ResultSet LayPhieuThuChiLoc(String IDNCC, String IDKH, String IDNV, String LoaiPhieuu, String HangMuc){
          String query = "select * from ThuChi where "+IDNCC+""+IDKH+""+IDNV+" loaiphieu like '%"+LoaiPhieuu+"%' and hangmucthuchi like '%"+HangMuc+"%'";
          ResultSet rs = DAO.DBConection.GetData(query);
          System.out.println(query);
          return rs;
      }
      public static ResultSet LayThuChiLocNguoiDung() {
        String query = "Select DISTINCT idnguoidung from ThuChi";
        ResultSet rs = DAO.DBConection.GetData(query);
        return rs;
    }
      public static ResultSet LayThuChiLocKhachHang() {
        String query = "Select DISTINCT idkhachhang from ThuChi";
        ResultSet rs = DAO.DBConection.GetData(query);
        return rs;
    }
        public static ResultSet LayThuChiLocNhaCungCap() {
        String query = "Select DISTINCT idnhacungcap from ThuChi";
        ResultSet rs = DAO.DBConection.GetData(query);
        return rs;
    }
    public static int ThemPhieuThuBanHang(DTOPhieuThuChi ptc) {
        String cauTruyVan = "INSERT INTO `ThuChi`( `mathuchi`, `idkhachhang`,`loaiphieu`,`hangmucthuchi`, `tongtien`, `ghichu`)"
                + " VALUES ("
                + "'" + ptc.getMaThuChi() + "',"
                + "'" + ptc.getIDKhachHang() + "',"
                + "'" + ptc.getLoaiPhieu() + "',"
                + "'" + ptc.getHangMucThuChi() + "',"
                + "'" + ptc.getTongTien() + "',"
                + "'" + ptc.getGhiChu() + "')";
        System.out.println(cauTruyVan);
        return DBConection.ExcuteTruyVan(cauTruyVan);
    }
     public static int ThemPhieuChiNhapHang(DTOPhieuThuChi ptc) {
        String cauTruyVan = "INSERT INTO `ThuChi`( `mathuchi`, `idnhacungcap`,`loaiphieu`,`hangmucthuchi`, `tongtien`, `ghichu`)"
                + " VALUES ("
                + "'" + ptc.getMaThuChi() + "',"
                + "'" + ptc.getIDNhaCungCap() + "',"
                + "'" + ptc.getLoaiPhieu() + "',"
                + "'" + ptc.getHangMucThuChi() + "',"
                + "'" + ptc.getTongTien() + "',"
                + "'" + ptc.getGhiChu() + "')";
        System.out.println(cauTruyVan);
        return DBConection.ExcuteTruyVan(cauTruyVan);
    }

    
}
