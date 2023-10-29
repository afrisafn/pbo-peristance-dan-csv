/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo9;


import pbo7.*;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fauziah
 */
@Entity
@Table(name = "daftar_buku")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DaftarBuku.findAll", query = "SELECT d FROM DaftarBuku d")
    , @NamedQuery(name = "DaftarBuku.findByIsbn", query = "SELECT d FROM DaftarBuku d WHERE d.isbn = :isbn")
    , @NamedQuery(name = "DaftarBuku.findByJudulBuku", query = "SELECT d FROM DaftarBuku d WHERE d.judulBuku = :judulBuku")
    , @NamedQuery(name = "DaftarBuku.findByTahunTerbit", query = "SELECT d FROM DaftarBuku d WHERE d.tahunTerbit = :tahunTerbit")
    , @NamedQuery(name = "DaftarBuku.findByPenerbit", query = "SELECT d FROM DaftarBuku d WHERE d.penerbit = :penerbit")})
public class DaftarBuku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "isbn")
    private Integer isbn;
    @Column(name = "judul_buku")
    private String judulBuku;
    @Column(name = "tahun_terbit")
    private Integer tahunTerbit;
    @Column(name = "penerbit")
    private String penerbit;

    public DaftarBuku() {
    }

    public DaftarBuku(Integer isbn) {
        this.isbn = isbn;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public Integer getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(Integer tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DaftarBuku)) {
            return false;
        }
        DaftarBuku other = (DaftarBuku) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pbo9.DaftarBuku[ isbn=" + isbn + " ]";
    }
    
}
