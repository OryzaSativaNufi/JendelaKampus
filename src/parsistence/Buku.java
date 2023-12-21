/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parsistence;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "buku")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Buku.findAll", query = "SELECT b FROM Buku b")
    , @NamedQuery(name = "Buku.findByIdBuku", query = "SELECT b FROM Buku b WHERE b.idBuku = :idBuku")
    , @NamedQuery(name = "Buku.findByJudul", query = "SELECT b FROM Buku b WHERE b.judul = :judul")
    , @NamedQuery(name = "Buku.findByIsbn", query = "SELECT b FROM Buku b WHERE b.isbn = :isbn")
    , @NamedQuery(name = "Buku.findByBahasa", query = "SELECT b FROM Buku b WHERE b.bahasa = :bahasa")
    , @NamedQuery(name = "Buku.findByPengarang", query = "SELECT b FROM Buku b WHERE b.pengarang = :pengarang")
    , @NamedQuery(name = "Buku.findByPenerbit", query = "SELECT b FROM Buku b WHERE b.penerbit = :penerbit")})
public class Buku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_buku")
    private String idBuku;
    @Column(name = "judul")
    private String judul;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "bahasa")
    private String bahasa;
    @Column(name = "pengarang")
    private String pengarang;
    @Column(name = "penerbit")
    private String penerbit;
    @JoinTable(name = "kategori_buku", joinColumns = {
        @JoinColumn(name = "id_buku", referencedColumnName = "id_buku")}, inverseJoinColumns = {
        @JoinColumn(name = "id_kategori", referencedColumnName = "id_kategori")})
    @ManyToMany
    private Collection<Kategori> kategoriCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "buku")
    private Collection<PeminjamanBuku> peminjamanBukuCollection;

    public Buku() {
    }

    public Buku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBahasa() {
        return bahasa;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    @XmlTransient
    public Collection<Kategori> getKategoriCollection() {
        return kategoriCollection;
    }

    public void setKategoriCollection(Collection<Kategori> kategoriCollection) {
        this.kategoriCollection = kategoriCollection;
    }

    @XmlTransient
    public Collection<PeminjamanBuku> getPeminjamanBukuCollection() {
        return peminjamanBukuCollection;
    }

    public void setPeminjamanBukuCollection(Collection<PeminjamanBuku> peminjamanBukuCollection) {
        this.peminjamanBukuCollection = peminjamanBukuCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBuku != null ? idBuku.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buku)) {
            return false;
        }
        Buku other = (Buku) object;
        if ((this.idBuku == null && other.idBuku != null) || (this.idBuku != null && !this.idBuku.equals(other.idBuku))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Parsistence.Buku[ idBuku=" + idBuku + " ]";
    }
    
}
